package com.mycs.demo.java_cs.algo;

import java.util.Arrays;

public class BinarySearch {

    // 이진 탐색 함수
    public int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0;  // 배열의 시작 인덱스
        int right = arr.length - 1;  // 배열의 끝 인덱스

        while (left <= right) {  // 탐색 범위가 유효한 동안 반복
            int mid = left + (right - left) / 2;  // 중간 인덱스 계산

            // 중간 값과 타겟 값이 같으면, 타겟을 찾은 것
            if (arr[mid] == target) {
                return mid;  // 타겟 값의 인덱스를 반환
            }

            // 타겟 값이 중간 값보다 작으면, 오른쪽 범위를 제외하고 왼쪽 범위로 탐색
            if (arr[mid] > target) {
                right = mid - 1;
            }
            // 타겟 값이 중간 값보다 크면, 왼쪽 범위를 제외하고 오른쪽 범위로 탐색
            else {
                left = mid + 1;
            }
        }

        // 타겟 값이 배열에 없으면 -1 반환
        return -1;
    }
}
