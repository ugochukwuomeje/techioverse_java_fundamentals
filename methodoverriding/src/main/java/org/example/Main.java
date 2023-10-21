package org.example;

public class Main{
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SubAddClass subAddClass = new SubAddClass();

        double result = subAddClass.product(21, 11);

        System.out.println(">>>>>>> the product of 21 and 11: "+result);

    }


}