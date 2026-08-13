class Pair{
    int el;
    int diff;
    Pair(int a, int b){
        el=a;
        diff=b;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.diff!=b.diff)
                    return Integer.compare(b.diff,a.diff);
                return Integer.compare(b.el,a.el);
            }
        );
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(x-arr[i]);
            pq.add(new Pair(arr[i],diff));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> list= new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().el);
        }
        Collections.sort(list);
        return list;
        
    }
}