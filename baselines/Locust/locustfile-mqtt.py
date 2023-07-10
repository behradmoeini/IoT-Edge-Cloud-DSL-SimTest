from locust import HttpUser, task, between
import paho.mqtt.client as mqtt

class MyUser(HttpUser):
    wait_time = between(1, 2)
    
    def on_connect(client, userdata, flags, rc):
        print("Connected with result code "+str(rc))

    @task
    def send_mqtt_message(self):
        client = mqtt.Client()
        client.on_connect = self.on_connect
        client.connect("192.168.1.1", 1883, 60)
        client.publish("test/topic", "Hello, MQTT!")
        client.disconnect()

