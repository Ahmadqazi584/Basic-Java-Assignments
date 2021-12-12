package com.company;
/*
 *Write a java program to exchange the values of
 *two variables of integer type A and B using
 *third temporary variable C.
 */
public class Basicjavaquestion2 {
    public static void main(String[] args){
        int a = 4;
        int b = 6;
        int c = 0;
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
    }
}
