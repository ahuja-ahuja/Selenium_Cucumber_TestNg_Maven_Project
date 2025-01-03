# Test Automation Framework

This repository contains a Maven-based Test Automation Framework using Cucumber and TestNG, designed for efficient and scalable test automation.

## Key Features

- **Cucumber Framework**: Behavior-driven development (BDD) approach for writing and executing test cases.
- **TestNG Integration**: Used for test execution and lifecycle management.
- **Reporting**: 
  - Integrated with **Extent Reports** for detailed and visually appealing test reports.
  - Includes screenshot capture for failed test cases.
- **Page Object Model (POM)**: Structured approach to maintain page elements and actions, enhancing test maintainability.
- **Hooks Implementation**: Used to manage setup and teardown activities for tests.

## Prerequisites

- **Java**: Ensure you have JDK 8 or later installed.
- **Maven**: Install Maven for dependency management and build execution.

## Prerequisites
After test execution, reports can be found in the target folder. The following reports are available:

HTML Reports: Provides a detailed breakdown of test execution in a user-friendly format.
JSON Reports: Machine-readable output for integration with other tools.
Extent Reports: Comprehensive and visually appealing reports, including screenshots for failed test cases.

## Learning Reference
This project is inspired by and built using concepts learned from the Udemy course:
[Cucumber Tutorial for Beginners](https://www.udemy.com/course/cucumber-tutorial)

## Running Tests

To execute tests from the command line, use the following command:

```bash
mvn compile test


