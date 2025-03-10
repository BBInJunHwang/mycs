package com.mycs.demo.java_cs.solid.liskov_substitution_principle.as_is;

/**
 * LSP (리스코프 치환 원칙)
 * 자식 클래스는 부모 클래스를 대체할 수 있어야 한다
 *
 * AS-IS
 * 펭귄은 Bird를 상속받아서 구현하고 있다.
 * 하지만 펭귄은 날지 못한다.
 * 이렇게 되면 Bird의 서브 타입인 Penguin은 Bird로 교체할 수 없다.
 * 이는 LSP 위반이다.
 *
 *
 * */

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
