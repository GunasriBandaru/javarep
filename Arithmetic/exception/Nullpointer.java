package com.ivy.Arithmetic.exception;

class Nullpointer
{
    public static void main(String args[])
    {
        String abc=null;
        try{


            if (abc.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");

        }
        catch(NullPointerException e){
            System.out.println ("  x");
        }
    }
}
