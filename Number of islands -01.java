class Solution {
    public int numIslands(char[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int count =0;
      int[][] vis = new int[n][m];
      for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
            if(grid[i][j]=='1' && vis[i][j]==0){
                count++;
                bfs(grid,vis,i,j,n,m);
            }
        }
      }
      return count;
    }
    public void bfs(char[][] grid,int[][]vis,int row,int col,int n,int m){
       Queue<int[]>q = new LinkedList<>();
       q.add(new int[]{row,col});
       vis[row][col] =1;
       int[] delRow = {-1,0,1,0};
       int[] delCol = {0,1,0,-1};
       while(!q.isEmpty()){
        int[] cell = q.poll();
        int r = cell[0];
        int c = cell[1];
        for(int i =0;i<4;i++){
            int nr = r+delRow[i];
            int nc = c+delCol[i];
            if(nr<0 || nr>=n || nc<0 || nc>=m || grid[nr][nc]=='0' || vis[nr][nc]==1)continue;
            q.add(new int[]{nr,nc});
            vis[nr][nc]=1;
       }
       }

    }
