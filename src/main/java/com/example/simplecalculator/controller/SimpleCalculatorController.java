package com.example.simplecalculator.controller;

import com.example.simplecalculator.service.SimpleCalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class SimpleCalculatorController {

    private final SimpleCalculatorService simpleCalculatorService;

    public SimpleCalculatorController(SimpleCalculatorService simpleCalculatorService){
        this.simpleCalculatorService = simpleCalculatorService;
    }

    @GetMapping("/{operator}/{num1}/{num2}")
    public String calculate(@PathVariable(name = "operator") String operator,
                            @PathVariable(name = "num1") int number1,
                            @PathVariable(name = "num2") int number2) {

        return "Resualt: " + simpleCalculatorService.calculate(operator,number1,number2);
    }

}
