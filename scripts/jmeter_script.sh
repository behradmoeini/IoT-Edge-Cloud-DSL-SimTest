#!/bin/bash

# Define an array of delays
declare -a delays=("1000" "2000" "3000")

# Test plan file
TEST_PLAN="test_plan.jmx"

# Loop over the delays
for delay in "${delays[@]}"
do
    echo "Running JMeter with delay: $delay"

    # Run JMeter
    jmeter -n -t $TEST_PLAN -Jdelay=$delay

    # Wait for 10 seconds
    echo "Waiting for 10 seconds before next run..."
    sleep 10
done

echo "All runs completed."
