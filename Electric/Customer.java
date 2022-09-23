package com.ivy.Electric;
import java.util.Scanner;

class user
{
    Scanner sc=new Scanner(System.in);
    void m1()

    {

        System.out.println("Application");
    }
}
class customer {
    void use() {

        System.out.println("Please enter email");
        String Email = sc.nextLine();
        System.out.println("Please enter username");
        String username = sc.nextLine();
        System.out.println("Please enter password");
        String password = sc.nextLine();
        System.out.println("Please enter role");
        String role = sc.nextLine();
        System.out.println(Email+username+password+role);
    }
    void customer() {
        System.out.println("Please enter view");
        String view = sc.nextLine();
        System.out.println(" search product");
        String searchProduct = sc.nextLine();
        System.out.println("buyproduct");
        String buy = sc.nextLine();
        System.out.println("logout");
        String logout = sc.nextLine();
        System.out.println(view+buy+logout);

    }
}
class Admin {
    void admin() {
        System.out.println("view products");
        System.out.println("view Employee");
        System.out.println("add new emp");
        String add = sc.nextLine();
        System.out.println(" add product");
        String addprod = sc.nextLine();
        System.out.println("remove");
        String remove = sc.nextLine();
        System.out.println("Remove employee");
        String remp = sc.nextLine();
        System.out.println("logout");
        System.out.println("the employee added is :"+ add);
        System.out.println("the added product is"+addprod);
        System.out.println("The removed product is"+remove);
        System.out.println("the remnved employee is:"+remp);

    }
}
class employee {
    void emp() {
        System.out.println("view product");
        String view = sc.nextLine();
        System.out.println("ship a product");
        String sp = sc.nextLine();
        System.out.println("update a quantntity of product");
        String update = sc.nextLine();
        System.out.println("logout");
        String log = sc.nextLine();
        System.out.println(view+sp+update+log);
    }
}

public class Customer{
    public static void main(String args[])
    {
        Admin obj=new Admin();
        obj.admin();
    }
}