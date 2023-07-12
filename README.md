# A Domain-Specific Language for Simulation-Based Testing of IoT Edge-to-Cloud Solutions

This repository is dedicated to the `IoT-Edge-Cloud-DSL-SimTest` project. The project involves the development and testing of `IoTECS`, a domain-specific language (DSL) designed for creating edge-to-cloud simulators, which are critical in testing IoT systems for applications such as smart cities or autonomous vehicles.

The `IoTECS` DSL is developed with the aim to validate the scalability of cloud applications under heavy IoT device loads. This repository contains all the necessary code and scripts for the `IoTECS` DSL, including user interface files, the main codebase, testing scripts, and Integrated Development Environment (IDE) configuration files.

The repository also includes the results of various experiments conducted as part of the project. These results are stored in the `results` directory.

In addition, this repository includes files related to `JMeter` and `Locust`, two popular stress testing tools. These tools were used to simulate experiments, and their results are compared with our `IoTECS` simulator. The files related to these tools can be found in the `baselines` directory, each in their respective subdirectories.


![Edge to Cloud Communication Diagram](figs/EdgeToCloudCommunication.jpg)

## Abstract

The Internet of Things (IoT) is increasingly prevalent in domains such as emergency response, smart cities and autonomous vehicles. Simulation plays a key role in the testing of IoT systems, noting that field testing of a complete IoT product may be infeasible or prohibitively expensive. In this paper, we propose a \emph{domain-specific language (DSL)} for generating edge-to-cloud simulators. An edge-to-cloud simulator executes the functionality of a large array of edge devices that communicate with cloud applications. Our DSL, named IoTECS, is the result of a collaborative project with an IoT analytics company, Cheetah Networks. 
The industrial use case that motivates IoTECS is ensuring the scalability of cloud applications by putting them under extreme loads from IoT devices connected to the edge. We implement IoTECS using Xtext and empirically evaluate its usefulness. We further reflect on the lessons learned.

## Directory Structure

```bash
├── baselines
│   ├── JMeter
│       ├── Stores files for the JMeter load testing simulation
│   ├── Locust
│       ├── Stores files for the Locust load testing simulation
├── IoTECS
│   ├── This is the core directory for the IoTECS simulator.
├── figs
│   ├── This directory stores images used in the study
├── results
│   ├── Contains results for research question 1, 2, and 3


```

## Prerequisites

Before starting, ensure your system has these tools installed:

- Eclipse 2021-12
- JDK 11
- Virtual Box 6.1
- Docker 20.10.11
- Xtext 2.25.0 ([Download](https://www.eclipse.org/Xtext/))
- Xtend 2.25.0 ([Download](https://www.eclipse.org/Xtend/))
- Ubuntu 20.04 disc image ([Download](https://ubuntu.com/download/desktop))
- TShark (Wireshark) 3.4.9
- Python 3.8.8
- SSH

## Installation and Running Steps

Follow these steps to perform simulation-based testing for IoT Cloud applications using IoTECS:

1. Extract the contents of `IoTECS.zip` and open all the projects in Eclipse.
2. Navigate to `iotecs->src->iotecs->IoTECS.xtext`, then run as "Generate Xtext Artifacts".
3. Go to `iotecs->src->iotecs->GenerateIoTECS.mwe2`, and run as "MWE2 Workflow".
4. Launch the DSL project (`iotecs`) as "Eclipse Applications", choosing to launch "Runtime Eclipse".
5. Create Ubuntu 20.04 virtual machines (via Virtual Box) for each platform of type "VM".
6. Install Python, JDK, and TShark on both the local machine and all remote platforms.
7. In the runtime Eclipse Platform, create a new Java project and a new file with an "iot" extension (e.g., `test.iot`). If asked to convert 'test' to an Xtext project, select "yes". Input the specific instance of the conceptual model for IoTECS according to the grammar or use the provided demonstration IoTECS project and modify it as necessary.
8. Save the file created in step 7. This will generate code and scripts in the "src-gen" directory of the project (e.g., `test->src-gen`).
9. Install OpenSSH and ensure that localhost, Platforms, and SimulationNodes can communicate using ssh and scp.
10. Navigate to the generated directory of the IoTECS project (`src-gen/`) and run `main.sh`.

Ensure you follow the steps in the provided order for successful setup and execution of your IoT Cloud applications with IoTECS.
