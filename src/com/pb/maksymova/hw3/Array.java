package com.pb.maksymova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int cntPosNum = 0;
        boolean isSort = false;
        int buf;

        //наполнили
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива " +i);
            array[i] = scan.nextInt();
        }

        //вывод всех эл-в массива
        //String intArrayString = ;
        System.out.println("Введенный массив: " + Arrays.toString(array));

        //сумма эл-в массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        //кол-во положительных эл-в массива
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                cntPosNum++;
            }
        }
        System.out.println("Количество положительных элементов массива: " + cntPosNum);

        //сортировка массива
        while(!isSort) {
            isSort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSort = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив от меньшего к большему: " + Arrays.toString(array));
    }
}
