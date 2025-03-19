package com.mycs.demo.java_cs.grammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample {

    int[] num = {5,3,1,4,2};

    public void printOrder(){
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    public void printReverseOrder(){
        Integer[] integerArr = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArr));
    }


    public void arrayToArrayList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
    }

    public void arrayListtoArray(){
        int[] arr = {1,2,3,4};



        List<Integer> r = Arrays.stream(arr).boxed().toList();





        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public void test(){
        String[] array = {"apple", "banana", "cherry"};

        // 배열을 List<String>으로 변환
        List<String> list = Arrays.asList(array);

        /////////////////

        List<String> list2 = Arrays.asList("apple", "banana", "cherry");

        // List<String>을 string[] 배열로 변환
        String[] array2 = list.toArray(new String[0]);

    }

    public void test2(){
        String text = "test";

        char [] a = text.toCharArray();

    }
}
