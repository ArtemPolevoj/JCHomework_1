package org.example.calculator;

import java.util.Scanner;

public class Value {
    Scanner scanner = new Scanner(System.in);

    /**
     * Метод получения числа
     *
     * @return число
     */
    public double getNumber() {
        double temp = 0;
        try {
            return  scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Не верный ввод числа");
        }
           return temp;
    }

    /**
     * Метод получения математического знака
     *
     * @return строка
     */
    public String getSing() {
        return scanner.next();
    }
}
