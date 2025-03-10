package com.mycs.demo.java_cs.solid.open_closed_priciple.to_be;


/**
 * TO-BE
 * 결제 타입에 따라서 처리 로직을 분기하는 부분을 분리하여 OCP를 준수하도록 한다.
 * Payment 클래스 인터페이스를 만들고, 각 결제 타입에 대한 구현체를 만들어서 분기처리를 분리한다.
 *
 * */
public interface Payment {
    void process();
}
