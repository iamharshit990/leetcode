class Solution {
    public void helper(int[][]adj, boolean[] vis, ArrayList<Integer> ans, int node) {
        ans.add(node);
        vis[node] = true;
        for (int i = 0; i < adj[node].length; i++) {
            int number = adj[node][i];
            if (adj[node][i]==1&&vis[i] == false) {
                helper(adj, vis, ans, i);
            }
        }
        return;
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis [] = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]){
                helper(adj, vis, ans, i);
                res++;
            }
        }
        return res;
    }

    
}