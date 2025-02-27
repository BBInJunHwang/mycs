package com.mycs.demo.java_cs.integer_cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerCacheTest {

    @Test
    void integerCache1() {
        // given
        IntegerCache integerCache = new IntegerCache();

        // when
        boolean result = integerCache.integerCacheTrue();

        // then
        assertTrue(result);
    }

    @Test
    void integerCache2() {
        // given
        IntegerCache integerCache = new IntegerCache();

        // when
        boolean result = integerCache.integerCacheFalse();

        // then
        assertFalse(result);
    }
}