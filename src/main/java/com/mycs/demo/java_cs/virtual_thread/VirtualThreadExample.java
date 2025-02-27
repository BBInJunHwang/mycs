package com.mycs.demo.java_cs.virtual_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 버추얼 스레드의 특징
 * 경량화:
 * 전통적인 OS 스레드는 커널에서 관리
 * 버추얼 스레드는 자바 JVM에서 관리 => 더 적은 메모리를 소비하고, 스레드의 생성과 소멸이 빠름
 *
 * 많은 수의 스레드 관리 가능:
 * OS 스레드 기반으로 많은 스레드를 관리하면 성능에 문제가 발생할 수 있음
 * 버추얼 스레드를 사용하면 수십만 개의 스레드도 효율적으로 관리
 *
 * 비동기 프로그래밍: 버추얼 스레드는 비동기 프로그래밍의 효과를 활용할 수 있음
 * 단 CPU 연산이 많은 작업에는 적합하지 않음
 *
 * */
public class VirtualThreadExample {
    public void virtualThread() {
        // Virtual Thread Executor 생성
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        // 5개의 버추얼 스레드를 실행합니다.
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                // 각 스레드가 수행하는 작업
                System.out.println("Task " + taskId + " is running on virtual thread: " + Thread.currentThread().getName());
                try {
                    // 작업을 시뮬레이션 (1초 동안 대기)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " completed on virtual thread: " + Thread.currentThread().getName());
            });
        }

        // 작업 완료를 기다린 후 Executor 종료
        executor.shutdown();
    }
}
