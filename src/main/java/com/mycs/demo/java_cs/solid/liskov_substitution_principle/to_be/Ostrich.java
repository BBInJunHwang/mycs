package com.mycs.demo.java_cs.solid.liskov_substitution_principle.to_be;

public class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
