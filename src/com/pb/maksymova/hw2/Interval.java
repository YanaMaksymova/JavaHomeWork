package com.pb.maksymova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");

        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("Введите целое число:");
        x = scan.nextInt();

        if(x>=0 && x <=14) {
            System.out.println("Число входит в диапапзон [0 -14]");
        } else if (x>=15 && x <=35) {
            System.out.println("Число входит в диапапзон [15 - 35]");
        } else if (x>=36 && x <=50) {
            System.out.println("Число входит в диапапзон [36 - 50]");
        } else if (x>=51 && x <100) {
            System.out.println("Число входит в диапапзон [51 - 100]");
        } else {
            System.out.println("Число не входит ни в один имеющийся диапапзон");
        }
    }
}
