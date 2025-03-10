package com.mycs.demo.spring_cs.lock.pessimistic.service;

import com.mycs.demo.spring_cs.lock.pessimistic.model.Stock;
import com.mycs.demo.spring_cs.lock.pessimistic.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    @Transactional
    public void decreaseStock(Long stockId, int amount) {
        Stock stock = stockRepository.findByIdWithPessimisticLock(stockId)
                .orElseThrow(() -> new RuntimeException("Stock not found"));
        stock.decrease(amount);
    }
}