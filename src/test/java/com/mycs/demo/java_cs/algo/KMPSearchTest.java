package com.mycs.demo.java_cs.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KMPSearchTest {

    @Test
    void kmpSearch() {
        KMPSearch kmpSearch = new KMPSearch();
        String text = "ABABABABAC";
        String pattern = "ABABAC";
        int result = kmpSearch.kmpSearch(text,pattern);
        System.out.println(result);
    }
}