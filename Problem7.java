package Practice_4Pillars;

import java.util.Scanner;

/*
In an e-commerce system, create a superclass 'Product' with a method 'calculateDiscount'.
Create subclasses 'Electronics', 'Clothing', and 'Groceries', each overriding 'calculateDiscount' with their specific discount logic.
Demonstrate polymorphism by calculating discounts for various products.
 */
class Product{
    String item;
    float price;
    float discount;
    float finalprice=0;
    Scanner sc=new Scanner(System.in);
    void Buy(){
        System.out.println("Enter Product Detail: ");
        System.out.print("Enter Item: ");
        item = sc.next();
        System.out.print("Enter Price: ");
        price = sc.nextFloat();
        System.out.print("Enter Discount: ");
        discount = sc.nextFloat();
    }
    void calculateDiscount(){
        System.out.println("There is Sell and having some discount: ");
    }
}

class Electronics extends Product{
    void calculateDiscount(){
        finalprice = (100-discount)/100*price;
        System.out.println("Final Price: Rs. "+finalprice);
    }
}

class Clothes extends Product{
    void calculateDiscount(){
        finalprice = (100-discount)/100*price;
        System.out.println("Final Price: Rs. "+finalprice);
    }
}

class Groceries extends Product{
    void calculateDiscount(){
        finalprice = (100-discount)/100*price;
        System.out.println("Final Price: Rs. "+finalprice);
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Electronics elc = new Electronics();
        elc.Buy();
        elc.calculateDiscount();

        Clothes cl = new Clothes();
        cl.Buy();
        cl.calculateDiscount();

        Groceries gr = new Groceries();
        gr.Buy();
        gr.calculateDiscount();

    }
}
