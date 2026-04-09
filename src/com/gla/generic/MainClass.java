package com.gla.generic;

public class MainClass {
    public static void main(String[] args) {
        Box<Long> obj1 = new Box<>();
        obj1.setValue(333333333333L);
        Box<Integer> obj2 = new Box<>();
        obj2.setValue(33);
        long val = 333333333333333L;
        int x = (int) val;
        System.out.println(obj1.getValue());
    }
}