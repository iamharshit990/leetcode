class Solution {
    class Pair{
        int el;
        int diff;

        Pair(int a,int b){
            el=a;
            diff=b;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans= new ArrayList<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b) -> {
                if(a.diff!=b.diff) 
                    return Integer.compare(b.diff,a.diff);
                return Integer.compare(b.el,a.el);
            }
        );
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            pq.add(new Pair(arr[i],diff));
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll().el);
        }
        Collections.sort(ans);
        return ans;
        
    }
}