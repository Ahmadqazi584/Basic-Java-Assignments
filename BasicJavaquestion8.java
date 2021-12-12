package com.company;
import java.util.Scanner;
/** WAP to count the number of vowel present in a String and print them
 *	O/P:
 *		Enter a String : How are you?
 *		Number of vowel : 5  */
public class BasicJavaquestion8 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'i' || arr[i] == 'A'
            || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                count++;
            }
        }
        System.out.print("Number of vowel : " + count);
    }
}

