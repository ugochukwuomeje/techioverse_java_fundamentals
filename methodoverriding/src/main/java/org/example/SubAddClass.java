package org.example;

public class SubAddClass extends SuperAddClass {

    @Override
    public double product(double first, double second){

        double result = first * second;

        if(result % 2 >0){

          return  super.product(first, second);

        }

        return result;
    }
}
