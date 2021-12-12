package com.company;
/*
 *WAP generate a random number between 10 and 50 and
 *check whether that is even or odd.
 *(Hint: To generate random number between min and max is
 *     int x=(int)(Math. random()*(max-min)+1)+min;
 *Now x contains the random number.)
 */
public class BasicJavaquestion3 {
    public static void main(String[] args){
        int x = (int)(Math.random()*(50-10)+1) + 10;
        if (x%2 == 0){
            System.out.println(x + " the number is even");
        }else {
            System.out.println(x + " the number is odd");
        }
    }
}
