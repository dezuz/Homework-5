package com.mateacademy.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

public class CalculatorRealisation {
    private Map<Character, DoubleBinaryOperator> calculatorMap = new HashMap<>();

    public CalculatorRealisation() {
        calculatorMap.put('+', (first, second) -> first + second);
        calculatorMap.put('*', (first, second) -> first * second);
        calculatorMap.put('/', (first, second) -> {
            if (second == 0) {
                throw new IllegalArgumentException("Division by the zero");
            }
            return first / second;
        });
        calculatorMap.put('-', (first, second) -> first - second);
        calculatorMap.put('#', (number, indexOfTheRoot) -> {
            if (indexOfTheRoot == 0) {
                throw new IllegalArgumentException("Division by the zero");
            }
            return Math.pow(number, 1 / indexOfTheRoot);
        });
        calculatorMap.put('^', (number, power) -> Math.pow(number, power));
        calculatorMap.put('?', (first, power) -> Math.pow((first + power) / (first + 117), power));
    }

    public double calculate(double firstNumber, char operation, double secondNumber) {
        return Optional.ofNullable(calculatorMap.get(operation)).orElseThrow(()
                -> new IllegalArgumentException("Unknown operation")).applyAsDouble(firstNumber, secondNumber);
    }
}
