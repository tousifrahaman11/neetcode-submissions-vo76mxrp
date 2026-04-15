class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];

        for(int c = 0; c < m; c++){
            dfs(0, c, pac,heights, n, m);
            dfs(n-1, c, atl,heights, n, m);
        }
        for(int r = 0; r<n; r++){
            dfs(r, 0, pac, heights, n, m);
            dfs(r,m-1, atl, heights, n, m);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int r = 0; r <n; r++){
            for(int c = 0; c<m; c++){
                if(pac[r][c] && atl[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }
        return res;
    }
    static void dfs(int r, int c, boolean[][] vis, int[][] heights, int n, int m){
        vis[r][c] = true;
        int[][] dirs = {{0,1},{0,-1}, {1,0},{-1, 0}};

        for(int[] dir : dirs){
            int nr = r + dir[0];
            int ny = c + dir[1];

            if(nr<0 || ny<0 || nr>=n || ny >= m){
                continue;
            }
            if(vis[nr][ny]) continue;

            if(heights[nr][ny] < heights[r][c]){
                continue;
            }
            dfs(nr, ny, vis, heights, n, m);
        }
    }
}
