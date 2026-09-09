class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int ans = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int diff = prefix-k;
            if(map.containsKey(diff)){
                ans+=map.get(diff);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return ans;
    }
}