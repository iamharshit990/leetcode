class Solution {
    public int maximumSum(int[] arr) {
        int ans=arr[0];
        int power=0;
        int nopower=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=arr[i];
            int v2=nopower+arr[i];
            int v3=nopower;
            int v4=power+arr[i];
            ans=Math.max(ans,Math.max(Math.max(v1,v2),Math.max(v3,v4)));
            nopower=Math.max(v1,v2);
            power=Math.max(v3,v4);
        }
        return ans;
        
    }
}