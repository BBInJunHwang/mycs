package com.mycs.demo.java_cs.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoExample2Test {

    @Test
    void test1() {
        AlgoExample2 algoExample2 = new AlgoExample2();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7,8,9};

        Assertions.assertArrayEquals(new int[]{3,4,5}, algoExample2.test1(arr1,arr2));
    }

    @Test
    void test2(){
        AlgoExample2 algoExample2 = new AlgoExample2();
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int target = 4;

        Assertions.assertEquals(algoExample2.test2(arr1,target), 4);
    }

    @Test
    void test3(){
        AlgoExample2 algoExample2 = new AlgoExample2();
        Assertions.assertEquals(algoExample2.test3(10),55);
    }
}