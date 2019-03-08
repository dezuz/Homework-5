package com.mateacademy.calculator;

public class CalculatorRealisation {
    Calculator calculator = (firstNumber, secondNumber, operation) -> {
        return (operation == '+') ? addition(firstNumber, secondNumber)
                : (operation == '*') ? multiplication(firstNumber, secondNumber)
                : (operation == '/' && secondNumber != 0) ? division(firstNumber, secondNumber)
                : (operation == '-') ? subtraction(firstNumber, secondNumber)
                : (operation == '#' && secondNumber != 0 ) ? squareRoot(firstNumber, secondNumber)
                : (operation == '^') ? toThePower(firstNumber, secondNumber)
                : (operation == '?') ? customOperation(firstNumber, secondNumber) : 0;
    };

    private int addition(int first, int second) {
        return first + second;
    }

    private int multiplication(int first, int second) {
        return first * second;
    }

    private double division(int first, int second) {
        return (double)first / second;
    }

    private int subtraction(int first, int second) {
        return first - second;
    }

    private double squareRoot(int number, int indexOfTheRoot) {
        return Math.pow(number, 1 / (double)indexOfTheRoot);
    }

    private double toThePower(int number, int power) {
        return Math.pow(number, power);
    }

    private double customOperation(int first, int power) {
        return Math.pow((double)(first + power) / first, power) + 117;
    }
}