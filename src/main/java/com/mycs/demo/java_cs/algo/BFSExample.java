package com.mycs.demo.java_cs.algo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {

    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};  // 행 방향
    static int[] dy = {0, 0, -1, 1};  // 열 방향

    public int bfs(int[][] map, int startX, int startY, int endX, int endY) {
        int n = map.length;  // 맵의 행 개수
        int m = map[0].length;  // 맵의 열 개수

        // 방문 여부를 저장할 배열
        boolean[][] visited = new boolean[n][m];

        // 큐에 (x, y, 거리)를 넣어서 탐색
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0});  // 출발지점과 거리 0을 큐에 삽입
        visited[startX][startY] = true;  // 출발지점 방문 처리

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            // 목표지점에 도달하면 그때의 거리 반환
            if (x == endX && y == endY) {
                return dist;
            }

            // 상, 하, 좌, 우 방향으로 인접한 칸을 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 새로운 위치가 유효한지 확인
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && map[nx][ny] == 0) {
                    visited[nx][ny] = true;  // 방문 처리
                    queue.offer(new int[]{nx, ny, dist + 1});  // 거리 + 1로 큐에 삽입
                }
            }
        }
        return -1;  // 목표지점에 도달할 수 없으면 -1 반환
    }
}
