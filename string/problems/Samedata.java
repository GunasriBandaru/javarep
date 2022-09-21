package com.ivy.string.problems;
//4.Write a Java program to check whether two String objects contain the same data.
//Sample output:
//"Stephen Edwin King" equals "Walter Winchell"? false
//"Stephen Edwin King" equals "Mike Royko"? false
import java.util.Scanner;
class Samedata
{
    public static void main(String args[])
    {
        String sentence1,sentence2;
        Scanner a =new Scanner(System.in);
        sentence1=a.nextLine();
        sentence2=a.nextLine();
        boolean var=sentence1.equals(sentence2);
        System.out.println(var);
    }
}