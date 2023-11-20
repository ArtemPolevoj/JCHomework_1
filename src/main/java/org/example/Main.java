package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.Value;

import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Value value = new Value();
        Calculator calculator = new Calculator();
        List<String> sings = List.of("+", "-", "*", "/", "exit");
        double a;
        double b;
        double result;
        String sing;
        while (true) {
            System.out.println("-----CALCULATOR-----");
            System.out.print("Введите первое значение: ");
                a = value.getNumber();
            System.out.print("Введите действие или \"exit\" для выхода: ");
            sing = value.getSing();
            if (!sings.contains(sing)) {
                System.out.println("Не верное действие");
            } else if (sing.equals("exit")) {
                System.out.println("Выход");
                System.exit(1);
            } else {
                System.out.print("Введите второе значение: ");
                    b = value.getNumber();
                switch (sing) {
                    case "+"->{
                        result = calculator.sum(a, b);
                        System.out.printf("%.2f + %.2f = %.2f\n",a, b, result);
                    }
                    case "-"->{
                        result = calculator.difference(a, b);
                        System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
                    }
                    case "*"->{
                        result = calculator.multiply(a, b);
                        System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
                    }
                    case "/"->{
                        if (b != 0) {
                            result = calculator.division(a, b);
                            System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
                        } else {
                            System.out.println("На ноль делить нельзя");
                        }
                    }
                }
            }
        }
    }
}