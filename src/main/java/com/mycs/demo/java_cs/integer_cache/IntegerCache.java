package com.mycs.demo.java_cs.integer_cache;

public class IntegerCache {

    /**
     * Integer.valurOf(int) 호출 시 -128 ~ 127 사이의 값이면 캐시된 값을 반환한다.
     * 즉 동일 객체이다.
     * 메모리 사용량을 줄이고 성능을 최적화하기 위해 사용한다.
     * 자주 사용되는 값이기 때문에 캐시된 값을 사용한다.
     * */
    public boolean integerCacheTrue() {
        Integer a = 100;
        Integer b = 100;

        return a == b;
    }

    /**
     * Integer.valurOf(int) 호출 시 -128 ~ 127 사이의 값이 아니면 캐시된 값을 반환하지 않는다.
     * 범위를 벗어나면 새로운 객체를 생성한다.
     * 단 Jvm의 구현에 따라 범위가 달라질 수 있다. java -Djava.lang.Integer.IntegerCache.high=1000
     * */
    public boolean integerCacheFalse() {
        Integer a = 1000;
        Integer b = 1000;

        return a == b;
    }
}
