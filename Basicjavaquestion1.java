package com.company;
//Write a Java Program to calculate the Compound Interest where
//        Principal=2000, Time=3 years, Rate =7%.
//        Formula Amount=P(1+r/100)^t
public class Basicjavaquestion1 {
    public static void main(String[] args){
        int principal = 2000;
        byte Time = 3;
        byte Rate = 7;
        double Interest;
        Interest = principal* Math.pow((1 + (Rate/100f)), Time);
        double net = Interest - principal;
        System.out.println("The interest : " + net);
    }
}
