package com.mycs.demo.java_cs.grammer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> treeMap = new TreeMap<>();

    public void print(){
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);


//        for (Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        map.forEach((key,value) -> System.out.println(key + ": " + value));
    }

    public void treeMapPrint(){
        treeMap.put("c", 3);
        treeMap.put("a", 1);
        treeMap.put("b", 2);

        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void mapHasKey(){
        map.put("a", 1);
        map.put("b", 2);

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("c"));
    }

}
