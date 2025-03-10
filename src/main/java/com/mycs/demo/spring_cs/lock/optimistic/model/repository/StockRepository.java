package com.mycs.demo.spring_cs.lock.optimistic.model.repository;

import com.mycs.demo.spring_cs.lock.pessimistic.model.Stock;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 낙관적락
 * @Version을 사용하여 동시에 업데이트가 발생하면 충돌 예외 발생
 * 충돌 시 예외를 핸들링하여 재시도 로직을 추가해야 함
 * 락을 걸지 않기 때문에 성능은 좋지만, 충돌이 자주 발생하면 문제가 될 수 있음
 * 
 * */
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    @Lock(LockModeType.OPTIMISTIC)
    @Query("SELECT s FROM Stock s WHERE s.id = :id")
    Optional<Stock> findByIdWithOptimisticLock(Long id);
}