package com.mycs.demo.java_cs.solid.dependency_inversion_principle.to_be;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("무선 키보드로 타이핑 중");
    }
}
