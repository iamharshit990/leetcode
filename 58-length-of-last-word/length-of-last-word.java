class Solution {
    public int lengthOfLastWord(String s) {
       int ans=0;
       int index=s.length()-1;
       while(s.charAt(index)==' '){
            index--;
       }
       while(index>=0&&s.charAt(index)!=' '){
        index--;
        ans++;
       }
       return ans;
        
    }
}