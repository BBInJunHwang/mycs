package com.mycs.demo.java_cs.algo;

public class KMPSearch {
    // KMP 알고리즘을 위한 부분 일치 테이블 만들기
    private int[] buildPartialMatchTable(String pattern) {
        int m = pattern.length();
        int[] table = new int[m];
        int j = 0;  // j는 일치할 때까지의 문자의 수

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];  // 부분 일치가 될 때까지 이동
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            table[i] = j;
        }

        return table;
    }

    // KMP 알고리즘을 사용하여 문자열 검색
    public int kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] table = buildPartialMatchTable(pattern);
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;  // 패턴을 찾은 경우, 시작 인덱스를 반환
            }
        }
        return -1;  // 패턴을 찾지 못한 경우
    }
}
