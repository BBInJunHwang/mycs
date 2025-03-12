package com.mycs.demo.java_cs.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoExampleTest {

    @Test
    void test1() {
        AlgoExample algoExample = new AlgoExample();
        int[] arr = {3,3,4,1,2};
        int[] result = algoExample.test1(arr);
        assertArrayEquals(new int[]{1,2,3,4,}, result);
    }

    @Test
    void test2(){
        AlgoExample algoExample = new AlgoExample();
        String test = "([])";
        boolean result = algoExample.test2(test);
        assertTrue(result);
    }

    @Test
    void test2_2(){
        AlgoExample algoExample = new AlgoExample();
        String test = "({])";
        boolean result = algoExample.test2(test);
        assertFalse(result);
    }

    @Test
    void test3(){
        AlgoExample algoExample = new AlgoExample();
        int[] arr = {3,4,2,1};
        assertArrayEquals(new int[]{1,2,3,4}, algoExample.test3(arr));
    }
}