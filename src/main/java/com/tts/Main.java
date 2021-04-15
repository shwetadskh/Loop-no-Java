package com.tts;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter 1 no: ");
        int num1=sc1.nextInt();
        System.out.println("Enter 2 no: ");
        int num2=sc1.nextInt();
        System.out.println("Enter 3 no: ");
        int num3=sc1.nextInt();
        System.out.println("Enter 4 no: ");
        int num4=sc1.nextInt();
        System.out.println("Enter 5 no: ");
        int num5=sc1.nextInt();


        List<Integer> intList = new ArrayList<>();
        intList.add(num1);
        intList.add(num2);
        intList.add(num3);
        intList.add(num4);
        intList.add(num5);
        System.out.println(intList);

        int sum = 0;
        for( int num : intList) {
            sum = sum+num;
        }
        System.out.println("Sum of all No: " + sum);

        //sort an array
        List<Integer> sortedList = new ArrayList<>(intList);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        int max = sortedList.get(sortedList.size()-1);
        int min = sortedList.get(0);
        System.out.println("Max No: " + max);
        System.out.println("Max No: " + min);

        // For Product calculation
        int product = num1 * num2 * num3 * num4 * num5;
        System.out.println("Product of the No: " + product);

    }
}
