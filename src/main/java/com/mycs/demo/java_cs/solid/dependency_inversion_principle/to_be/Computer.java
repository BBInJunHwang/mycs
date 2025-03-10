package com.mycs.demo.java_cs.solid.dependency_inversion_principle.to_be;

/**
 * TO-BE
 * Computer 클래스는 Keyboard 인터페이스에 의존하도록 변경
 * 그럴시 Keyboard 인터페이스를 구현한 클래스들을 사용할 수 있게 된다.
 *
 * DIP 적용: 유선 키보드 사용
 * Keyboard wiredKeyboard = new WiredKeyboard();
 * Computer computer1 = new Computer(wiredKeyboard);
 * computer1.useKeyboard();
 *
 * DIP 적용: 무선 키보드 사용 (코드 수정 없이 확장 가능)
 * Keyboard wirelessKeyboard = new WirelessKeyboard();
 * Computer computer2 = new Computer(wirelessKeyboard);
 * computer2.useKeyboard();
 *
 * */
public class Computer {
    private final Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }


    public void use(){
        keyboard.type();
    }
}
