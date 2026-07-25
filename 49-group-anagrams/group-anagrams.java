class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char [] arr= new char[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            String curr= new String(arr);
            if(!map.containsKey(curr)){
                map.put(curr,new ArrayList<>());
            }
            map.get(curr).add(s);


        }
        return new ArrayList<>(map.values());
    }
}