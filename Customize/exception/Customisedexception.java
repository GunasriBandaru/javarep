package com.ivy.Customize.exception;

class abc extends Exception
{
    abc(String str)
    {
        super(str);
    }
}
class Customisedexception
{
    static void m1(int height) throws abc
    {
        if(height<120)
        {
            throw new abc("height is not eligible for rollcaster");
        }
        else
        {
            System.out.println("eligible for height");
        }
    }
    public static void main(String args[])
    {
        try
        {
            m1(100);
        }
        catch(abc e)
        {
            System.out.println("caught exception"+" " + e);
        }
    }
}
