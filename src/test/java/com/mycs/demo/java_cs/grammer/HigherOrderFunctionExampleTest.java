package com.mycs.demo.java_cs.grammer;

import com.mycs.demo.java_cs.grammer.HigherOrderFunctionExample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HigherOrderFunctionExampleTest {

    @Test
    void multiplyByTwo() {
        HigherOrderFunctionExample higherOrderFunctionExample = new HigherOrderFunctionExample();
        Assertions.assertThat(higherOrderFunctionExample.multiplyByTwo()).isEqualTo(14);
    }

    @Test
    void addTwo() {
        HigherOrderFunctionExample higherOrderFunctionExample = new HigherOrderFunctionExample();
        Assertions.assertThat(higherOrderFunctionExample.addTwo()).isEqualTo(9);
    }

    @Test
    void multiplyByTwoAndAddFive() {
        HigherOrderFunctionExample higherOrderFunctionExample = new HigherOrderFunctionExample();
        Assertions.assertThat(higherOrderFunctionExample.multiplyByTwoAndAddFive()).isEqualTo(11);
    }
}