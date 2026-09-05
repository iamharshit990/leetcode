class Solution {
    public void helper(int[][]adj, boolean[] vis, int node) {
        vis[node] = true;
        for (int i = 0; i < adj[node].length; i++) {
            int number = adj[node][i];
            if (adj[node][i]==1&&vis[i] == false) {
                helper(adj, vis, i);
            }
        }
        return;
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean vis [] = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]){
                helper(adj, vis, i);
                res++;
            }
        }
        return res;
    }

    
}