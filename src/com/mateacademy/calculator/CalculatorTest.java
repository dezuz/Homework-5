package com.mateacademy.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorRealisation calculatorRealisation = new CalculatorRealisation();
        double result;

        result = calculatorRealisation.calculator.calculator(-5, 20, '+');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(7, 11, '*');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(78, 39, '/');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(10, -2, '-');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(25, 2, '#');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(5, 3, '^');
        System.out.println(result);
        result = calculatorRealisation.calculator.calculator(1, 2, '?');
        System.out.println(result);
    }
}
