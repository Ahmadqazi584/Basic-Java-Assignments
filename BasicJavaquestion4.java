package com.company;
import java.util.Scanner;
/*
 *WAP to input a character and check whether that is a vowel or not.
 */
public class BasicJavaquestion4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char WAP = input.next().charAt(0);
        if (WAP == 'a' || WAP == 'e' || WAP == 'i' || WAP == 'o' || WAP == 'u' || WAP == 'A' || WAP == 'E' || WAP == 'I' || WAP == 'O' || WAP == 'U') {
            System.out.println(WAP + " the character entered is vowel");
        }else {
            System.out.println(WAP + " the number entered is not vowel");
        }
        
    }
}
