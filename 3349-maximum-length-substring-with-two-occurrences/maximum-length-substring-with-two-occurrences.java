class Solution {
    public int maximumLengthSubstring(String s) {
        int low=0;
        int high=0;
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<s.length()){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                if(map.containsKey(s.charAt(low))){
                    map.put(s.charAt(low),map.get(s.charAt(low))-1);
                    low++;
                }
            }
            ans=Math.max(ans,high-low+1);
            high++;

        }
        return ans;
        
    }
}