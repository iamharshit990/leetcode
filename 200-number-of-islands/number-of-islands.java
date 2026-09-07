class Solution {
    // without boolean arr
    int x[] = {-1,1,0,0};
    int y[] = {0,0,-1,1};
    public boolean valid(int i ,int j,int n,int m){
        if(i>=n||i<0||j>=m||j<0) return false;
        return true;
    }
    public void helper(char[][]grid,int i,int j,int n,int m){
        grid[i][j]='2';
        for(int k=0;k<4;k++){
            int row = i+x[k];
            int col = j+y[k];
            if(valid(row,col,n,m)&&grid[row][col]=='1'){
                helper(grid,row,col,n,m);
            }
        }
        return ;

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m =grid[0].length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j,n,m);
                    res++;
                }
            }
        }
        return res;
        
    }
}