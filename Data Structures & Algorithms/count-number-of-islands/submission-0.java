class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sem = 0;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == '1'){
                    bfs(grid,i, j);
                    sem++;
                }
            }
            
        }
        return sem;
    }
    static void bfs(char[][] grid, int i, int j){
        Queue<int[]> q1 = new LinkedList<>();
        q1.add(new int[] {i, j});
        grid[i][j] = '0';

        int[][] dirs = {{1, 0},{-1, 0}, {0,1},{0,-1}};

        while(!q1.isEmpty()){
            int[] cell = q1.poll();
            int r = cell[0];
            int c = cell[1];

            for(int[] d : dirs){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr>=0 && nr < grid.length && nc >= 0 && nc <grid[0].length && grid[nr][nc] == '1'){
                    q1.add(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
