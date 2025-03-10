package com.mycs.demo.java_cs.solid.open_closed_priciple.as_is;

import org.springframework.stereotype.Service;


/**
 * OCP(Open-Closed Principle, 개방-폐쇄 원칙)
 * 확장에 대해서는 열려 있어야 하지만 변경에 대해서는 닫혀 있어야 한다.
 *
 * AS-IS
 * PaymentService 클래스는 결제 타입에 따라서 처리 로직을 분기하고 있기 때문에 OCP를 위반하고 있다.
 * 새로운 결제수단이 추가될때마다 processPayment 메서드를 수정해야 하기 때문이다.
 * */

@Service
public class PaymentService {
    public void processPayment(String type) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing credit card payment...");
        } else if (type.equals("PayPal")) {
            System.out.println("Processing PayPal payment...");
        }
    }
}
