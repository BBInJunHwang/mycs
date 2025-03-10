package com.mycs.demo.spring_cs.lock.pessimistic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

// ✅ Entity 정의
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

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
