class Solution {
    public int maximumSum(int[] arr) {
        int ans=arr[0];
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int prevnodelete=nodelete;
            int prevonedelete=onedelete;
            int v2=0;
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            if(prevonedelete==Integer.MIN_VALUE){
                v2=arr[i];
            }
            else{
                v2=prevonedelete+arr[i];
            }
            onedelete=Math.max(prevnodelete,v2);
            ans=Math.max(ans,Math.max(nodelete,onedelete));
        }
        
        return ans;
        
    }
}