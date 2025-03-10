package com.mycs.demo.java_cs.solid.interface_segregation_principle.to_be;

public class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
