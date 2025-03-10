package com.mycs.demo.java_cs.solid.interface_segregation_principle.to_be;

/**
 * TO-BE
 * Robot은 Eatable 인터페이스를 구현하지 않음
 * 사용하지 않는 인터페이스에 의존하지 않음
 *
 * */

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("I am working");
    }
}
