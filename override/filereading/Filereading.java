package com.ivy.override.filereading;
///*common functionality
//        -open file
//        - read file
//        - abstract method  produce report()
//        - send via email/slack*/
public class Filereading{
    public static void main(String args[])
    {
        open obj1=new open();
        obj1.produceReport();
        read obj2=new read();
        obj2.produceReport();
    }
}
