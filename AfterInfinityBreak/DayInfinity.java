class Solution {

    public int[] dx = {-1, 0, 1, 0};
    public int[] dy = {0, -1, 0, 1};

    public int bfs(int[][] grid, int i, int j,int row, int col){
        grid[i][j] = 2;

        int cnt =1;
        for(int k = 0;k<4;k++){
            int x = i+ dx[k];
            int y = j + dy[k];
            if(x>=0 && x< row && y>=0 && y<col && grid[x][y]==1){
                
                cnt += bfs(grid, x, y, row, col);
                
            }
        }
        return cnt;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;

        int mcnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){

                    int cnt = bfs(grid, i, j, n, m);
                    mcnt = Math.max(mcnt, cnt);

                }
            }
        }
        return mcnt;
    }
}