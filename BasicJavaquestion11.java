package com.company;
/* Write a method to compute a user defined power method. */
import java.util.Scanner;
public class BasicJavaquestion11 {
   public int power(int num, int p){
       int fact = 1;
       for (int i = 0; i < p; i++) {
           fact = fact * num;
       }
       return fact;
   }
    public static void main(String[] args){
       BasicJavaquestion11 b = new BasicJavaquestion11();
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
       int num = input.nextByte();
        System.out.print("Enter the power over it : ");
       int pow = input.nextByte();
       int p = b.power(num, pow);
        System.out.println("The number " + num + " having power " + pow + " : " + p);
   }
}
