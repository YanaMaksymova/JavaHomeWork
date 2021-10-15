package com.pb.maksymova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        operand1 = scan.nextInt();
        operand2 = scan.nextInt();
        sign = scan.next();

        if(operand2 == 0 && sign.equals("/")){
            System.out.println("Деление на 0!");
        }
        else {
            switch (sign){
                case "+":
                    System.out.println("x + y = " + (operand1+operand2));
                    break;
                case "-":
                    System.out.println("x - y = " + (operand1-operand2));
                    break;
                case "*":
                    System.out.println("x * y = " + (operand1*operand2));
                    break;
                case "/":
                    System.out.println("x / y = " + (operand1/operand2));
                    break;
                default:
                    System.out.println("Неверно введенные данные. Попробуйте еще раз.");
            }
        }
    }
}