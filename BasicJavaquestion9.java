package com.company;
import java.util.Scanner;
import java.util.Random;
/**  Write a java program to create an array of size N and store
 * the random values in it and find the sum and average.  */
public class BasicJavaquestion9 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int avg = 0;
        int sum = 0;
        System.out.print("Enter the size : ");
        byte N = input.nextByte();
        int [] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i+1) + " : ");
            arr[i] = input.nextByte();
            sum = sum + arr[i];
        }
        avg = sum/ arr.length;
        System.out.println("The sum till N : " + sum);
        System.out.println("The average till N : " + avg);
    }
}
