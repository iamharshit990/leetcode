class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> have = new HashMap<>();
        Map<Character,Integer> req = new HashMap<>();
        for(int i=0;i<s.length();i++){
            have.put(s.charAt(i),have.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<target.length();i++){
            req.put(target.charAt(i),req.getOrDefault(target.charAt(i),0)+1);
        }
        int res=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e:req.entrySet()){
            char c = e.getKey();
            int need = e.getValue();
            int hav=0;
            if(have.containsKey(c)) hav = have.get(c);
            int times = hav/need;
            res=Math.min(res,times);
        }
        return res;
        
    }
}