package com.mycs.demo.java_cs.algo;

import java.util.*;
import java.util.stream.Collectors;

public class AlgoExample {

    // 정수배열에서 중복값 제거 / 중복 제거 후 배열 반환
    public int[] test1(int[] testArray) {
        Set<Integer> set = new HashSet<>();
        for (int i : testArray) {
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        return list.stream().mapToInt(i -> i).toArray();
    }

    // 주어진 문자열이 유효한 괄호 문자인지 검사하세요 () {} []
    public boolean test2(String test) {
        char[] testArray = test.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char s : testArray) {
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
            } else {
                if (s == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (s == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (s == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // 주어진 정수 배열을 오름차순으로 정렬
    public int[] test3(int[] test){
        List<Integer> list = Arrays.stream(test).boxed().collect(Collectors.toList());
        Collections.sort(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
