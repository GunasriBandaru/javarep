package com.ivy.basicproblems;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int num;
        int temp=0;
        Scanner a =new Scanner(System.in);
        num=a.nextInt();
        int i=1;

        while(num!=0)
        {
            temp=temp*10;
            temp=temp+num%10;
            num=num/10;
        }
        System.out.println(temp);
    }
}
