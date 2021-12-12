package com.company;
import java.util.Scanner;
/* WAP to print sum of all the digit of a given number.  */
public class BasicJavaquestion5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0, R = 0;
        for (int i = num; i > 0 ; i = i /10) {
            R = i%10;
            sum = sum + R;
        }
        System.out.println( num + " the number entered all digit sum is : " + sum);
    }
}
