package com.mycs.demo.java_cs.solid.interface_segregation_principle.as_is;

public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
