# Simple Calculator

This is a simple calculator application built using Spring Boot. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division through a RESTful API.

## Features

- Supports addition, subtraction, multiplication, and division operations.
- RESTful API endpoints for performing calculations.
- Error handling for division by zero and invalid operators.

## Technologies Used

- Java
- Spring Boot

## Usage

To use the calculator, send HTTP GET requests to the `/calc/{operator}/{num1}/{num2}` endpoint, where:
- `{operator}` is one of: `sum`, `subtract`, `mult`, `div`.
- `{num1}` and `{num2}` are the numbers on which the operation will be performed.

## Example usage:
```
GET /calc/sum/5/3
```
Response:
```
Result: 5 + 3 = 8
```
