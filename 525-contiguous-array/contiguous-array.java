class Solution {
    public int findMaxLength(int[] nums) {
        int zeroes=0;
        int ones=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            else ones++;
            int diff=zeroes-ones;
            if(diff==0){
                ans=Math.max(ans,i+1);
            }
            if(map.containsKey(diff)){
                ans=Math.max(ans,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
        }
        return ans;
        
    }
}