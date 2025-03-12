package com.mycs.demo.java_cs.grammer;

import com.mycs.demo.java_cs.grammer.LambdaExample;
import org.junit.jupiter.api.Test;

class LambdaExampleTest {

    @Test
    void printOrder() {
        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.printOrder();
    }

    @Test
    void printReverseOrder() {
        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.printReverseOrder();
    }

    @Test
    void printStream() {
        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.printStream();
    }
}