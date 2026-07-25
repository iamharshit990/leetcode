class Solution {
    public int strStr(String haystack, String needle) {
        int n= needle.length();
        int low=0;
        int high=n-1;
        while(high<haystack.length()){
            String sub= haystack.substring(low,high+1);
            if(sub.equals(needle)) return low;
            low++;
            high++;
        }
        return -1;
        
    }
}