package com.mycs.demo.java_cs.algo;

public class DFSExample {
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};  // 행 방향
    static int[] dy = {0, 0, -1, 1};  // 열 방향

    // 방문 여부 체크
    static boolean[][] visited;

    public void dfs(int[][] map, int x, int y) {
        // 맵의 크기
        int n = map.length;
        int m = map[0].length;

        // 현재 위치가 유효하고, 방문하지 않았고, 0인 경우만 탐색
        if (x < 0 || y < 0 || x >= n || y >= m || visited[x][y] || map[x][y] == 1) {
            return;
        }

        // 방문 처리
        visited[x][y] = true;

        // 상, 하, 좌, 우로 DFS 재귀 호출
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            dfs(map, nx, ny);
        }
    }

    public int countConnectedAreas(int[][] map) {
        int n = map.length;
        int m = map[0].length;
        visited = new boolean[n][m];
        int count = 0;

        // 맵을 탐색하면서 연결된 0들에 대해 DFS 호출
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    // 새로운 지역을 발견하면 DFS로 해당 지역 탐색
                    dfs(map, i, j);
                    count++;  // 지역 하나를 찾은 것
                }
            }
        }
        return count;  // 연결된 지역의 개수 반환
    }
}
