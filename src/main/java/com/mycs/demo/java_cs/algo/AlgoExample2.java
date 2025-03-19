package com.mycs.demo.java_cs.algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlgoExample2 {

    // 두 배열의 교집합
    public int[] test1(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }

        for (int j : arr2) {
            set2.add(j);
        }
        set1.retainAll(set2); // 교집합만 남긴다
        List<Integer> result = set1.stream().toList();
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 이진탐색
    public int test2(int[] arr, int target){
        //Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (arr[mid] == target){
                return mid +1;
            } else if (arr[mid] > target){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // dp 피보나치
    public int test3(int n){
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // greedy 동전
    public static int minCoins(int amount, int[] coins) {
        // 동전 종류를 내림차순으로 정렬
        Arrays.sort(coins);
        int count = 0;

        // 큰 동전부터 사용
        for (int i = coins.length - 1; i >= 0; i--) {
            // 현재 동전으로 몇 개를 쓸 수 있는지 구함
            while (amount >= coins[i]) {
                amount -= coins[i]; // 동전 하나를 사용
                count++; // 사용한 동전의 개수 증가
            }
        }
        return count; // 최소 동전 개수 반환
    }
}
