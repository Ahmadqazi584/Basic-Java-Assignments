package com.company;
import java.util.Scanner;
/* Write a method that finds the number of occurrences
 * of a specified character in a string
 * using the following header:
 *  public static int countCharacter(String str, char ch) */
public class BasicJavaquestion12 {
    public static int countCharacter(String str, char ch){
        int counter = 0;
        char [] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length() ; i++) {
            if (arr[i] == ch){
                counter++;
            }
        }
        return counter;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        System.out.print("Enter the character you want to check : ");
        char ch = input.next().charAt(0);
        int result = countCharacter(str, ch);
        System.out.println("The total " + ch + " in entered String are : " + result);

    }
}
