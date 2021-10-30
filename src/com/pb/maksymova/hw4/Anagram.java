package com.pb.maksymova.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static String cleanChar(String s) {
        String newS = s.replaceAll("[^а-яА-Я0-9a-zA-Z]", "").toLowerCase();
        return newS;
    }

    static String sort(String s) {
        String cleanS = cleanChar(s);
        char[] content = cleanS.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static boolean isAnagram (String s,String t) {
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String input0 = scan.nextLine();
        System.out.println("Введите вторую строку:");
        String input1 = scan.nextLine();
        boolean output = isAnagram(input0,input1);
        if (output == true){
            System.out.println("Анаграмма");
        }
        System.out.println("Не является анаграммой");
    }
}
