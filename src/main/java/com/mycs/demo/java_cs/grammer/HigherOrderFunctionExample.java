package com.mycs.demo.java_cs.grammer;

import java.util.function.Function;

public class HigherOrderFunctionExample {

    public static int applyOperation(int a, int b, Function<Integer, Integer> operation){
        return operation.apply(a+b); // operation 함수가 a + b의 결과를 처리
    }

    public static Function<Integer, Integer> composeFunctions(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return x -> f2.apply(f1.apply(x));  // f1을 먼저 적용한 후, 그 결과에 f2를 적용
    }

    public int multiplyByTwo(){
        Function<Integer, Integer> multiplyByTwo = a -> a * 2;
        return applyOperation(3, 4, multiplyByTwo);
    }

    public int addTwo(){
        Function<Integer, Integer> addTwo = a -> a + 2;
        return applyOperation(3, 4, addTwo);
    }

    public int multiplyByTwoAndAddFive(){
        Function<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function<Integer, Integer> addTwo = a -> a + 5;
        Function<Integer, Integer> multiplyByTwoAndAddTwo = composeFunctions(multiplyByTwo, addTwo);
        return multiplyByTwoAndAddTwo.apply(3);
    }
}
