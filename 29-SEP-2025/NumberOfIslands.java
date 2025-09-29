class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islands=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);

    }
}