package com.mycs.demo.java_cs.virtual_thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualThreadExampleTest {

    @Test
    void virtualThread() {
        // given
        VirtualThreadExample virtualThreadExample = new VirtualThreadExample();

        // when
        virtualThreadExample.virtualThread();

        // then
        assertTrue(true);
    }
}