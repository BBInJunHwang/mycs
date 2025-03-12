package com.mycs.demo.java_cs.grammer;

import com.mycs.demo.java_cs.grammer.MapExample;
import org.junit.jupiter.api.Test;

class MapExampleTest {

    @Test
    void print() {
        MapExample mapExample = new MapExample();
        mapExample.print();
    }

    @Test
    void printTreeMap(){
        MapExample mapExample = new MapExample();
        mapExample.treeMapPrint();
    }

    @Test
    void mapHasKey(){
        MapExample mapExample = new MapExample();
        mapExample.mapHasKey();
    }
}