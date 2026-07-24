class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //optimal 
        if(strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String s:strs){
            char count[]= new char[26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            String key= new String(count);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
            
        }
        return new ArrayList<>(map.values());
        
        
    }
}