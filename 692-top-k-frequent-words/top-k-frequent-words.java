class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        List<String> ans = new ArrayList<>();
        PriorityQueue<String> pq= new PriorityQueue<>(
            (a,b) -> {
                if (!map.get(a).equals(map.get(b)))
                        return Integer.compare(map.get(a), map.get(b)); // low freq = kick first
                return b.compareTo(a); // lexical large = kick first
            }
        );
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:map.keySet()){
            pq.add(s);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;

        
    }
}