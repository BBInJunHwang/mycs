package com.mycs.demo.spring_cs.lock.pessimistic.repository;

import com.mycs.demo.spring_cs.lock.pessimistic.model.Stock;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 비관적락
 * PESSIMISTIC_WRITE를 사용하면 다른 트랜잭션에서 해당 데이터를 수정할 수 없음
 * 데이터 충돌을 원천 차단하지만 동시성이 낮아질 가능성이 있음
 * DB에서 락을 관리하기 때문에, 트랜잭션이 길어지면 데드락 발생 가능
 *
 * */
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT s FROM Stock s WHERE s.id = :id")
    Optional<Stock> findByIdWithPessimisticLock(Long id);
}
