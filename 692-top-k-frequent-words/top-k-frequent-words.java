class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue <String> pq = new PriorityQueue<>(
            (a,b) ->{
                if(!map.get(a).equals(map.get(b)))
                    return Integer.compare(map.get(a),map.get(b));
                 return b.compareTo(a);

            } 
        );
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