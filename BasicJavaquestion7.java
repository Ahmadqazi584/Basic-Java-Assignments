package com.company;
import java.util.Scanner;
/* WAP to Input a number and check whether it is Prime or not.  */

public class BasicJavaquestion7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(num + " the number entered is prime number");
        }else {
            System.out.println(num + " the number entered is not prime number");
        }
    }
}
