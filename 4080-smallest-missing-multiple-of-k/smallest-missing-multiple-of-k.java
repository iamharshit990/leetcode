class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains((i+1)*k)){
                return (i+1)*k;
            }
        }
        return k*nums.length;
    }
}