package com.ivy.Arithmetic.exception;

class Arithmetic
{
    public static void main(String args[])
    {
        try{
            int num1=30;int num2=0;
            int result=num1/num2;
            System.out.println (result);
        }
        catch(ArithmeticException e){
            System.out.println ("  divided by zero");
        }
    }
}
