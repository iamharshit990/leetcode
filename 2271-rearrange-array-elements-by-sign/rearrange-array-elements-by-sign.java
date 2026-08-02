class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]= new int [nums.length/2];
        int neg[]= new int [nums.length/2];
        int index=0;
        for(int i:nums){
            if(i>0){
                pos[index++]=i;
            }
        }
        index=0;
        for(int i:nums){
            if(i<0){
                neg[index++]=i;
            }
        }
        int ans[]= new int[nums.length];
        int i=0;
        int j=0;
        index=0;
        while(i<pos.length&&j<neg.length){
            ans[index++]=pos[i++];
            ans[index++]=neg[j++];
        }
        return ans;

        
    }
}