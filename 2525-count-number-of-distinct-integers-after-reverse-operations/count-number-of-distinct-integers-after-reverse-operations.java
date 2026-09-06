class Solution {
    public int  helper(int n){
        int rev = 0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
            set.add(helper(i));
        }
        return set.size();

        
    }
}