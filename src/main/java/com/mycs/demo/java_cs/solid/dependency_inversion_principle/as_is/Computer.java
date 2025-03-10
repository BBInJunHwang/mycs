package com.mycs.demo.java_cs.solid.dependency_inversion_principle.as_is;

/**
 * DIP (의존 역전 원칙)
 * 상위 모듈은 하위 모듈에 의존하면 안된다. 둘 다 추상화에 의존해야 한다.
 * 클래스간의 의존성을 줄이는 것이 목적
 *
 * AS-IS
 * Computer 클래스가 Keyboard 클래스에 의존하고 있다.
 *
 * */
public class Computer {
    private final Keyboard keyboard;

    public Computer() {
        this.keyboard = new Keyboard();
    }


    public void use(){
        keyboard.type();
    }
}
