package com.mycs.demo.java_cs.solid.liskov_substitution_principle.to_be;

/**
 * LSP (리스코프 치환 원칙)
 * 자식 클래스는 부모 클래스를 대체할 수 있어야 한다
 *
 * TO-BE
 * 날 수 있는 새의 인터페이스
 * Bird를 상속받아서 구현하고 있다.
 * Vulture는 FlyingBird를 상속받아서 구현하고 있다.
 * Ostirch는 Bird를 상속받아서 구현하고 있다.
 *
 * */

public interface FlyingBird extends Bird {
    void fly();
}
