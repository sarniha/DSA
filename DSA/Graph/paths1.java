public static int minCost(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    
    boolean[][] visited = new boolean[n][m];
    
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    pq.offer(new int[]{grid[0][0], 0, 0});
    
    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int cost = curr[0];
        int r    = curr[1];
        int c    = curr[2];
        
        if (visited[r][c]) continue;  // stale, skip
        visited[r][c] = true;
        
        if (r == n - 1 && c == m - 1) return cost;
        
        for (int d = 0; d < 4; d++) {
            int nr = r + dx[d];
            int nc = c + dy[d];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                pq.offer(new int[]{cost + grid[nr][nc], nr, nc});
            }
        }
    }
    
    return -1;
}