class Solution {
    public int maximumLengthSubstring(String s) {
        int low=0;
        int high=0;
        int ans=0;
        int [] arr = new int[26];
        while(high<s.length()){
            char ch = s.charAt(high);
            arr[ch-'a']++;
            while(arr[ch-'a']>2){
                arr[s.charAt(low)-'a']--;
                low++;
            }
            ans=Math.max(ans,high-low+1);
            high++;

        }
        return ans;
        
    }
}