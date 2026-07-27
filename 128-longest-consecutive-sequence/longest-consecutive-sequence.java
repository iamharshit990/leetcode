class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set= new HashSet<>();
       for(int i:nums){
        set.add(i);
       }
       int ans=0;
       for(int i:set){
        int count=1;
        int updation=1;
        if(set.contains(i-1)) continue;
        while(set.contains(i+updation)){
            count++;
            updation++;
        }
        ans=Math.max(count,ans);
       }
       return ans;
    }
}