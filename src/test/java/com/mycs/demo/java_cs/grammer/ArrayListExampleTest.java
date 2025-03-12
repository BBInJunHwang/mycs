package com.mycs.demo.java_cs.grammer;

import com.mycs.demo.java_cs.grammer.ArrayListExample;
import org.junit.jupiter.api.Test;

class ArrayListExampleTest {

    @Test
    void print() {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.print();
    }

    @Test
    void printOrder() {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.orderPrint();
    }

    @Test
    void printReverseOrder() {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.reverseOrderPrint();
    }
}