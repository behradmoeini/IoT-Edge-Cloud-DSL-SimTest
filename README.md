# IoT-Edge-Cloud-DSL-SimTest

This repository contains the code used in the paper "A Domain-Specific Language for Simulation-Based Testing of IoT Edge-to-Cloud Solutions". This paper introduces a domain-specific language (DSL), \lang, designed for creating edge-to-cloud simulators, imperative in testing IoT systems for applications like smart cities or autonomous vehicles. Developed in conjunction with IoT analytics firm Cheetah Networks, the language aims to validate the scalability of cloud applications under heavy IoT device loads. Implemented using Xtext, \lang's utility is empirically evaluated, and the paper also presents reflections on the findings.
<img src="figs/fig1.jpg" width="900">

## Abstract

The Internet of things (IoT) is increasingly prevalent in domains such as emergency response, smart cities and autonomous vehicles. Simulation plays a key role in the testing of IoT systems, noting that field testing of a complete IoT product may be infeasible or prohibitively expensive. In this paper, we propose a \emph{domain-specific language (DSL)} for generating edge-to-cloud simulators. An edge-to-cloud simulator executes the functionality of a large array of edge devices that communicate with cloud applications. Our DSL, named \lang, is the result of a collaborative project with an IoT analytics company, Cheetah Networks. 
The industrial use case that motivates \lang\ is ensuring the scalability of cloud applications by putting them under extreme loads from IoT devices connected to the edge. We implement \lang\ using Xtext and empirically evaluate its usefulness. We further reflect on the lessons learned.
