class Solution {
    class Pair{
        int index;
        double dis;

        Pair(int i , double d){
            index=i;
            dis= d;
        }

    }
    public double helper(int arr[]){
        return Math.sqrt((arr[0]*arr[0])+(arr[1]*arr[1]));

    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b) -> Double.compare(b.dis,a.dis)
        );
        for(int i=0;i<points.length;i++){
            double dis = helper(points[i]);
            pq.add(new Pair(i,dis));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int index=0;
        int ans[][]= new int[k][];
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            ans[index++]=points[p.index];
        }
        return ans;

        
    }
}