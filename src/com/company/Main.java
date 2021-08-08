package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: Калькулятор");

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devideIgnoreZero.apply(a, b);

        calc.println.accept(c);

    }
}
