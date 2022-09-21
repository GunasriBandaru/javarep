package com.ivy.string.problems;
//6.Write a Java program to find whether a region in the current string matches a region in another string.
//Sample Output:
//str1[0 - 7] == str2[28 - 35]? true
//str1[9 - 15] == str2[9 - 15]? false
class Region
{
    public static void main(String args[])
    {
        String sentence1,sentence2;

        sentence1="Hdouse";
        sentence2="Houses";
        boolean var=sentence1.regionMatches(2,sentence2,1,4);
        System.out.println(var);
    }
}

//public class Main{
//    public static void main(String[] args) {
//      String str1 = "Alphabet is parent company of Google";
//      String str2 = "Alphabet is 4th most valued company and Alphabet is parent company of Google";
//
//        System.out.println(str1.length());
//        System.out.println(str2.lastIndexOf("Alphabet"));
//        System.out.println(str1.regionMatches(0,str2,40,36));
//
//
//    }
//}
