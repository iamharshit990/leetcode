class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue <Integer> pq= new PriorityQueue<>(
            (a,b)-> map.get(a)- map.get(b)
        );
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[] = new int[k];
        int index=0;
        while(!pq.isEmpty()){
            ans[index++]=pq.poll();

        }
        return ans;
        
    }
}