package com.mycs.demo.java_cs.grammer;

import java.util.Arrays;

public class ArrayExample {

    int[] num = {5,3,1,4,2};

    public void printOrder(){
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
