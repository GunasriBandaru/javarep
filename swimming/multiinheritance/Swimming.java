package com.ivy.swimming.multiinheritance;


//Grandfather(swims in well) Father(swims in river)Son(swims in pool) try to demo using multilevel inheritance
public class Swimming {
    public static void main(String args[])
    {
        Grandfather obj1=new Grandfather();
        String Grand= obj1.swims();
        System.out.println(Grand);
        Grandfather obj2=new Father();
        String Fath= obj2.swims();
        System.out.println(Fath);
        Father obj3=new Son();
        String Son=obj3.swims();
        System.out.println(Son);
    }
}

