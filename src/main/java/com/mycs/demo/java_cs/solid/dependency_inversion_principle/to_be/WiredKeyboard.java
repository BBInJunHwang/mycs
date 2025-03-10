package com.mycs.demo.java_cs.solid.dependency_inversion_principle.to_be;

public class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("유선 키보드로 타이핑 중");
    }
}
