package com.mycs.demo.java_cs.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void binarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1,3,5,9,8,7,2,6,4};
        int target = 6;
        int result = binarySearch.binarySearch(arr, target);
        System.out.println(result);
    }

}