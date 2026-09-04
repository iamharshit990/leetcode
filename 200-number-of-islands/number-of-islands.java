class Solution {
    int x[] = {-1, 1, 0, 0};
    int y[] = {0, 0, -1, 1};

    boolean valid(int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m) return false;
        return true;
    }

    public void dfs(char[][] arr, int i, int j, int n, int m) {
        // Mark the current cell as visited by sinking it (turning it to '0')
        arr[i][j] = '0'; 
        
        for (int k = 0; k < 4; k++) {
            int row = i + x[k];
            int col = j + y[k];
            
            // We no longer need to check a vis array
            if (valid(row, col, n, m) && arr[row][col] == '1') {
                dfs(arr, row, col, n, m);
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, n, m);
                    ans++; // Found a new island
                }
            }
        }
        return ans;
    }
}
