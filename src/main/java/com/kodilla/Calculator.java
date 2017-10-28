package com.kodilla;

public class Calculator {
    private int a;
    private int b;
    private int result;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition () {
        result = a + b;
        System.out.println("Addition " + a + " + " + b + " = " + result);
    }

    public void subtraction () {
        result = a - b;
        System.out.println("Subtraction " + a + " - " + b + " = " + result);
    }

    public void run () {
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
        addition();
        subtraction();
    }

    public static void main (String args[]) {
        Calculator calc = new Calculator(5,2);
        calc.run();
    }
}

