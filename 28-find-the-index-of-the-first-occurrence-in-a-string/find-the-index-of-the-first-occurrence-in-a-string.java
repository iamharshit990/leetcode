class Solution {
    public int strStr(String haystack, String needle) {
        int n= needle.length();
        int low=0;
        int high=n-1;
        while(high<haystack.length()){
            int index=0;
            for(int i=low;i<high+1;i++){
                if(haystack.charAt(i)==needle.charAt(index++)){
                    if(index==needle.length()) return low;
                    continue ;
                    
                }
                else break;
            }
            low++;
            high++;
        }
        return -1;
        
    }
}