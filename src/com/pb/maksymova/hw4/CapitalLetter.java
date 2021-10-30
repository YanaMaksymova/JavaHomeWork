package com.pb.maksymova.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String toUpperCase(String input){
        String newString = "";
        String[] inputParts = input.split(" ");
        for(int i = 0; i < inputParts.length; i++){
           newString = newString + inputParts[i].substring(0, 1).toUpperCase() + inputParts[i].substring(1) + " ";
        }
        newString = newString.trim();
        return newString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scan.nextLine();
        String output = toUpperCase(input);
        System.out.println(output);
    }
}
