class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f , int s){
            first = f;
            second =s;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.second!=b.second)
                    return Integer.compare(b.second,a.second);
                return Integer.compare(b.first,a.first);
            }
                
                
        );
        for(int i=0;i<arr.length;i++){
            int diff= Math.abs(arr[i]-x);
            pq.add(new Pair(arr[i],diff));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> ans= new ArrayList<>();
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            ans.add(p.first);
        }
        Collections.sort(ans);
        return ans;

        
    }
}