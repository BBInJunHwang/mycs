package com.mycs.demo.spring_cs.lock.optimistic.model.service;


import com.mycs.demo.spring_cs.lock.optimistic.model.repository.StockRepository;
import com.mycs.demo.spring_cs.lock.pessimistic.model.Stock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// ✅ Service (트랜잭션 필수!)
@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Transactional
    public void decreaseStock(Long stockId, int amount) {
        Stock stock = stockRepository.findByIdWithOptimisticLock(stockId)
                .orElseThrow(() -> new RuntimeException("Stock not found"));
        stock.decrease(amount);
    }
}