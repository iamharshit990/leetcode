class Solution {
    public boolean divideArray(int[] nums) {
        int freq[] = new int[500];
        for(int i:nums){
            freq[i-1]++;
        }
        for(int i:freq){
            if(i%2!=0) return false;

        }
        return true;


        
    }
}