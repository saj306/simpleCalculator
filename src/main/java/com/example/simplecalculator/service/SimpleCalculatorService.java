package com.example.simplecalculator.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService {

    public String calculate(String operator, int number1, int number2) {
        int result;
        switch (operator) {
            case "subtract":
                result = number1 - number2;
                return number1 + " - " + number2 + " = " + result;
            case "sum":
                result = number1 + number2;
                return number1 + " + " + number2 + " = " + result;
            case "mult":
                result = number1 * number2;
                return number1 + " * " + number2 + " = " + result;
            case "div":
                if (number2 != 0) {
                    result = number1 / number2;
                    return number1 + " / " + number2 + " = " + result;
                } else {
                    return "Cannot divide by zero!";
                }
            default:
                return "Invalid operator";
        }
    }
}
