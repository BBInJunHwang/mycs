package com.mycs.demo.java_cs.solid.interface_segregation_principle.as_is;


/**
 * ISP (인터페이스 분리 원칙)
 * 클라이언트가 사용하지 않는 인터페이스에 의존하도록 강요하지 말아야 한다.
 *
 * 현재 로봇은 먹지 못하지만 Worker 인터페이스에 eat 메소드가 있어서 구현하고 있다.
 * ISP 위반
 * => 인터페이스를 작게나눠야함
 * */

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("I don't eat");
    }
}
