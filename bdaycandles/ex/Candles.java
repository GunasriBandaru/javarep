package com.ivy.bdaycandles.ex;

import java.util.Scanner;

class Candles
{
    void birthdayCakeCandles()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter no of candels");
        int n = sc.nextInt();
        int maximum =0;int count=0;int num;
        for(int i =0; i < n; i++){
            System.out.println("Please enter the height of candels one by one");
            num = sc.nextInt();
            if(num > maximum){
                count=1;
                maximum = num;
            }else if(num == maximum){
                count++;
            }
        }
        System.out.println(count);

    }

}
