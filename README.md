# Multi Module Boilerplate Code

This is a boilerplate code inspired from [spring multi-module project](https://spring.io/guides/gs/multi-module/)

## Project Structure

    Parent POM: `mainModule/pom.xml`
    
    Child1 POM: `application/pom.xml`
        Rest controller application logic, which is dependent on Child2
    
    Child1 POM: `views/pom.xml`
        views contain only services used by Child1

## Dependencies
    kotlin: 1.5.10
    maven: 3.8.1
    spring: 2.5.1
    junit: 5.*.*
    jdk: 16

## To install dependencies
Run `mvn clean install` for first time from root folder.
