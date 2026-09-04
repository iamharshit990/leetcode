class Solution {
    int x[] = new int[]{-1,1,0,0};
    int y[]={0,0,-1,1};
    boolean valid(int i , int j, int n , int m){
        if(i<0||i>=n||j<0||j>=m) return false;
        return true;
    }
    public void dfs(char[][]arr,int n,int m,int i,int j,boolean[][]vis){
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int row = i+x[k];
            int col = j+y[k];
            if(valid(row,col,n,m)&&arr[row][col]=='1'&&vis[row][col]==false){
                dfs(arr,n,m,row,col,vis); 
            } 
        }
        return ;
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean [n][m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&&vis[i][j]==false){
                    dfs(grid,n,m,i,j,vis);
                    ans++;
                }
            }
            
        }
        return ans;


    }
}