#!/bin/bash

users=(80 90 100 110 120)

locustfile=locustfile-mqtt.py

for user in "${users[@]}"
do
  locust --headless --users "$user" --spawn-rate 10000 --locustfile "$locustfile"
  sleep 4
done

