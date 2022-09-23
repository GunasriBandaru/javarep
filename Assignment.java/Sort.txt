package com.ivy;
import java.util.*;
import java.lang.*;
public class Abc{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        String ans=m1(arr);
        System.out.println(ans);
    }
    static String m1(String arr[]){
        if(arr.length==0){
            return "Hello, my friend";
        }
        else if(arr.length==1){
            if(caps(arr[0])){
                return "HELLO, "+ arr[0];
            }
            else{
                return "Hello, "+arr[0];
            }
        }
        else if(arr.length==2){
            boolean a=caps(arr[0]);
            boolean b=caps(arr[1]);
            if(a && b){
                return "HELLO, "+arr[0]+" AND "+arr[1];
            }
            else if(a && !b){
                return "HELLO, "+arr[0]+" and Hello, "+arr[1];
            }
            else if(!a && b){
                return "Hello, "+arr[0]+" and HELLO, "+arr[1];
            }
            else{
                return "Hello, "+arr[0]+" and "+arr[1];
            }
        }
        else{
            return m2(arr);
        }
    }
    static boolean caps(String a){
        for(int i=0;i<a.length();i++){
            if(!(Character.isUpperCase(a.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static String m2(String arr[]){
        // more than 2 names
        for(int i=0;i<arr.length;i++){
            if(caps(arr[i])){
                return m3(arr);
                //break;
            }}
        String str="Hello, ";
        for(int j=0;j<arr.length-1;j++){
            str=str+arr[j]+",";
        }
        str=str+"and "+ arr[arr.length-1];
        return str;

    }

    public static String m3(String arr[]){
        String a="Hello ";
        String b="and HELLO ";
        for(int i=0;i<arr.length;i++){
            if(caps(arr[i])){
                b=b+arr[i]+",";
            }
            else{
                a=a+arr[i]+",";
            }
        }
        return a+", "+b;
    }
}