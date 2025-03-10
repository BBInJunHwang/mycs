package com.mycs.demo.spring_cs.lock.optimistic.model.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @Version  // 낙관적 락을 위한 버전 관리
    private Long version;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public void decrease(int amount) {
        if (this.quantity - amount < 0) {
            throw new RuntimeException("재고 부족");
        }
        this.quantity -= amount;
    }
}