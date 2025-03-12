package com.mycs.demo.java_cs.grammer;

public class TwoDArrayExample {
    int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };

    public void print(){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
