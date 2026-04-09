package com.gla.generic;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    static void PrintNumberWildCard(List<? extends Number>list) {
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? super Number> list3 = new ArrayList<Object>();
        list3.add(42);
        list3.add(3.14);
        System.out.println(list3);

        for(Number num : list){
            System.out.println(num.doubleValue());
        }
    }

    public static void main() {
        Box<String> stringBox = new Box<>();

    }
}