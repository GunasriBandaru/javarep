package com.ivy.Duck.ex;

interface Duck1
{
    void shape();
    void sell();
}
interface Duck2
{
    void floa();
}
class Duck implements Duck1,Duck2
{
    void fly(){
        System.out.println("I can fly");
    }

    @Override
    public void floa() {
        System.out.println("I can float");
    }

    @Override
    public void sell() {
        System.out.println("it can be sold");
    }

    @Override
    public void shape() {
        System.out.println("All the ducks are same shape");
    }

    void swim()
    {
        System.out.println("I can swim");
    }
    void noise()
    {
        System.out.println("I can make noise");
    }
    void walk()
    {
        System.out.println("I can walk");
    }
    void squeeze()
    {
        System.out.println("I can be  squeezed");
    }
    void decorate()
    {
        System.out.println("I can be used for decorate");
    }

}
