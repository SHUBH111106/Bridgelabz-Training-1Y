package com.gla.functionalInterface;
import java.util.*;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
class sum implements Calculator{
    public int calculate(int a, int b){
        return a+b;
    }
}
class product implements Calculator{
    public int calculate(int a, int b){
        return a*b;
    }
}
class subtraction implements Calculator{
    public int calculate(int a , int b){
        return a-b;
    }
}
class division implements Calculator{
    public int calculate(int a , int b){
        return a/b;
    }
}

public class XYZ {
    public static void main(String[] args) {
        Calculator sum = new sum();
        Calculator subtraction = new subtraction();
        Calculator product = new product();
        Calculator division = new division();

        System.out.println("Addition = " + sum.calculate(2, 5));
        System.out.println("Subtraction = " + subtraction.calculate(6, 4));
        System.out.println("Product = " + product.calculate(2, 6));
        System.out.println("Division = " + division.calculate(6, 2));
    }
}
