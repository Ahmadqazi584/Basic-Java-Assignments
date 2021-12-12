package com.company;
import java.util.Scanner;
/* WAP to input an array and Search an element from the array. */
public class BasicJavaPractice10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Enter the size of array : " );
        int n = input.nextByte();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value " + (i+1) + " : ");
            arr[i] = input.nextByte();
        }
        System.out.println("======================================== ");
        System.out.print("Enter the number you want to search : ");
        int num = input.nextByte();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                flag = true;
            }
        }
        if (flag){
            System.out.println(num + " is available in array");
        }else{
            System.out.println(num + " is unavailable in array");
        }
    }
}
