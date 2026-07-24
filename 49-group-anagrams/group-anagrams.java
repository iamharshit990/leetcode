class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> map= new HashMap<>();
        for(String s: strs){
            HashMap<Character,Integer> curr= new HashMap<>();
            for(int i=0;i<s.length();i++){
                curr.put(s.charAt(i),curr.getOrDefault(s.charAt(i),0)+1);
            }
            if(map.containsKey(curr)){
                List<String> now = map.get(curr);
                now.add(s);
                map.put(curr,now);
            }
            else{
                List<String> meow= new ArrayList<>();
                meow.add(s);
                map.put(curr,meow);
            }
        }
        List<List<String>> ans= new ArrayList<>();
        for(Map.Entry<HashMap<Character,Integer>, List<String>> e : map.entrySet()){
            List<String> group = e.getValue();
            ans.add(group);
        }
        return ans;
    }
}