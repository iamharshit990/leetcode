class Solution {
    public void helper(int [][]arr,boolean[]vis,int index){
        // it is a N*N so like it has detail about all edges like for 0 it would have relationship with all nodes given on arr[index]
        vis[index] = true;
        for(int i=0;i<arr[index].length;i++){
            if(!vis[i]&&arr[index][i]==1) helper(arr,vis,i);
        }
        return ;
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[isConnected.length];
        int res = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]) {
                helper(isConnected,vis,i);
                res++;
            }
        }
        return res;
    }
}