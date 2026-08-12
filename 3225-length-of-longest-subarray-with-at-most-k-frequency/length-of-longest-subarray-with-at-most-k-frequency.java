class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int low=0;
        int high=0;
        int ans=0;
        while(high<nums.length){
            int ch= nums[high];
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>k){
                if(map.containsKey(nums[low])){
                    map.put(nums[low],map.get(nums[low])-1);
                    if(map.get(nums[low])==0) map.remove(nums[low]);
                    low++;
                }
            }
            ans=Math.max(ans,(high-low+1));
            high++;
        }
        return ans;
        
    }
}