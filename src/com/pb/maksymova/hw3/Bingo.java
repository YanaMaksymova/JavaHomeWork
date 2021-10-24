package com.pb.maksymova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int systemNum = random.nextInt(101);
        int cnt = 0;
        int userNum;
        String help;

        System.out.println("Отгадайте загаданное число от 0 до 100.");
        System.out.println("Для выхода из программы введите: -1.");
        System.out.println("Введите загаданное число от 0 до 100:");
        userNum = scan.nextInt();

        while(userNum != -1){
            cnt ++;
            if(userNum != systemNum){
                if(userNum > systemNum){
                    help = "Загаданное число меньше введенного Вами. ";
                } else {
                    help = "Загаданное число больше введенного Вами. ";
                }
                System.out.println("Вы не угадали число. " + help + "Повторите попытку.");
                System.out.println("Введите загаданное число от 0 до 100:");
                userNum = scan.nextInt();
                continue;
            } else {
                System.out.println("Ура! Вы отгадали число! Количество попыток = " + cnt);
                break;
            }
        }
        System.out.println("Конец игры!");
    }
}