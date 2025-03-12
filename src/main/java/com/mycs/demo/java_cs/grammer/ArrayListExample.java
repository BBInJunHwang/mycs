package com.mycs.demo.java_cs.grammer;

import java.util.*;

public class ArrayListExample {

    List<Integer> list = new ArrayList<>(Arrays.asList(4,1,5,7,3,6,2));


    public void print(){
        list.forEach(System.out::println);
    }

    public void orderPrint(){
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    public void reverseOrderPrint(){
        //list.sort(Comparator.reverseOrder());
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::println);
    }
}
