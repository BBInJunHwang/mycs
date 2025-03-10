package com.mycs.demo.java_cs.solid.open_closed_priciple.to_be;

import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing credit card payment...");
    }
}
