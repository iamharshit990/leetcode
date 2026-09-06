class Solution {
    public int minPartitions(String n) {
        char ans = '0';
        for(int i=0;i<n.length();i++){
            char s = n.charAt(i);
            if(ans<s) ans = s;
        }
        return ans-'0';
        
    }
}