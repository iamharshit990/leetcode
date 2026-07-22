class Solution {
    public boolean isSubsequence(String s, String t) {
        //brute
        int i=0;
        int j=0;
        if(s.length()>t.length()) return false;
        while(i<s.length()){
            char ch= s.charAt(i);
            if(j>=t.length()) return false;
            char ch2=t.charAt(j);
            if(ch==ch2){
                i++;
            }
            j++;
        }
        return true;
        
    }
}