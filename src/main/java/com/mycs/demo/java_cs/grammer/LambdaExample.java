package com.mycs.demo.java_cs.grammer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    List<String> list = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");

    public void printOrder(){
        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }

    public void printReverseOrder(){
        list.sort((o1, o2) -> o2.compareTo(o1));
        list.forEach(System.out::println);
    }

    public void printStream(){
        List<String> result = list.stream()
                .filter(s-> s.contains("a"))
                .map(String::toUpperCase)
                .toList();

        result.forEach(System.out::println);
    }
}
