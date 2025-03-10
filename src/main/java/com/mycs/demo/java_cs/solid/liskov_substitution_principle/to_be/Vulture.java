package com.mycs.demo.java_cs.solid.liskov_substitution_principle.to_be;

public class Vulture implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
