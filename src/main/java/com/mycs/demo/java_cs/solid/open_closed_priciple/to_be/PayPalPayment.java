package com.mycs.demo.java_cs.solid.open_closed_priciple.to_be;

import org.springframework.stereotype.Service;

@Service
public class PayPalPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing PayPal payment...");
    }
}
