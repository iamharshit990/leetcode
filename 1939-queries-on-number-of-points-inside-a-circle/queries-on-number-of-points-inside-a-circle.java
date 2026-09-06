class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int cx = queries[i][0];
            int cy = queries[i][1];
            int r= queries[i][2];
            int curr = 0;
            for(int j=0;j<points.length;j++){
                int x = points[j][0];
                int y = points[j][1];
                int diff = ((x-cx)*(x-cx))+((y-cy)*(y-cy));
                if(diff<=r*r) curr++;
            }
            ans[i] = curr;
        }
        return ans;
    }
}