package com.mateacademy.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorRealisation calculatorRealisation = new CalculatorRealisation();
        double result;

        result = calculatorRealisation.calculate(-5, '+',20);
        System.out.println(result);
        result = calculatorRealisation.calculate(7, '*',11);
        System.out.println(result);
        result = calculatorRealisation.calculate(78, '/',39);
        System.out.println(result);
        result = calculatorRealisation.calculate(10, '-',-2);
        System.out.println(result);
        result = calculatorRealisation.calculate(25, '#',2);
        System.out.println(result);
        result = calculatorRealisation.calculate(5, '^',3);
        System.out.println(result);
        result = calculatorRealisation.calculate(1, '?', 2);
        System.out.println(result);
    }
}
