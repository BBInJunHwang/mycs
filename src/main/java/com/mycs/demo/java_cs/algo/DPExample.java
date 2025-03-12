package com.mycs.demo.java_cs.algo;

public class DPExample {

    // 계단오를때 1칸 or 2칸 오르기 가능 최저비용으로 N계단 오를때 방법
    public int test(int n){
        int[] dpSave = new int[n+1];
        dpSave[0] = 0;
        dpSave[1] = 1;
        dpSave[2] = 1;

        for(int i = 3; i <= n; i++){
            dpSave[i] = Math.min(dpSave[i - 1], dpSave[i - 2]) + 1;
        }
        return dpSave[n];
    }
}
