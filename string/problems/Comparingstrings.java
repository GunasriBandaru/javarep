package com.ivy.string.problems;
//Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
public class Comparingstrings{
    public static void main(String[] args)
    {
        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "Shyam";
        String s4 = "ABC";

        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}