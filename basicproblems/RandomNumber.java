package com.ivy.basicproblems;

//Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than
 //       the random number, the program should display "Too high, try again." If the user's guess is lower than the random number,
 //       the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.


import java.lang.Math;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        double Random_num = Math.random();
        double x;
        do {
            System.out.println(Random_num);
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble();
            if (x > Random_num) {
                System.out.println("Too high, try again.");
            } else if(x<Random_num){
                System.out.println("Too low, try again.");
            }
            else{
                System.out.println("You got it");
            }
        } while (x == Random_num);


    }
}
