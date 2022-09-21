package com.ivy.autoboxing;

import java.util.Scanner;
class Autoboxing{
    public static void main(String args[]){

        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        Integer j=a;

        if(j instanceof Integer)
        {
            System.out.println(j);
            System.out.println("object of integer is created");
        }
        double b;
        b=sc.nextDouble();
        Double d=b;
        if(d instanceof Double)
        {
            System.out.println(d);
            System.out.println("object of integer is created");
        }
    }

}
