package com.ivy.Runtimepolymorphism;
//Animal  Herbivores, Carnivores, and Omnivores eats(){//eats?} try to exhibit the Runtime polymorphism
public class Animal {
    public static void main(String[] args) {
     Herbivores ob=new Herbivores();
     Carnivores ob1=new Carnivores();
     Omnivores ob2=new Omnivores();
     ob.eat();
     ob1.eat();
     ob2.eat();

    }
}
