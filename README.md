# Spring AOP App

This is a sample Spring Boot application that demonstrates the use of Aspect-Oriented Programming (AOP) for API validation. The application includes a controller, an aspect, and necessary dependencies to enable AOP functionality.

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Aspect Details](#aspect-details)
- [Dependencies](#dependencies)
- [Build](#build)

## Overview

The project consists of a Spring Boot application with the following components:

1. **Main Application Class:** `SpringAopAppApplication`
    - Entry point for the application.
    - Annotated with `@SpringBootApplication`.

2. **Controller Class:** `CartController`
    - RESTful controller handling cart-related requests.
    - Demonstrates the use of `@RequestHeader` and validation with `@Pattern`.

3. **Aspect Class:** `ApiValidationAspect`
    - AOP aspect for validating and modifying the affiliate header.
    - Uses `@Before` advice to intercept method calls in `CartController` and validate the affiliate header.

## Project Structure


## Usage

1. Clone the repository:

    ```bash
    git clone <repository-url>
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

4. Access the API:

   Open a web browser or a tool like [Postman](https://www.postman.com/) and make a GET request to `http://localhost:8080/{cartId}`. Ensure to provide the `affiliate` header with a valid value.

## Aspect Details

The `ApiValidationAspect` aspect intercepts method calls in the `CartController` and performs affiliate header validation. If the header is invalid, an `IllegalArgumentException` is thrown.

## Dependencies

- Spring Boot Starter Actuator
- Spring Boot Starter Web
- Spring Boot Starter AOP
- Spring Boot Starter Validation
- Spring Boot DevTools (runtime)
- Project Lombok (optional)
- Spring Boot Starter Test (for testing)


## Social Profile
- [LinkedIn](https://www.linkedin.com/in/ashwanicse/)
- [Leetcode](https://leetcode.com/ashwani__kumar/)
- [Need Help? Schedule A Call](https://topmate.io/ashwanikumar)
## Linkedin Newsletter
- [Subscribe](https://www.linkedin.com/newsletters/7084124970443767808/)
