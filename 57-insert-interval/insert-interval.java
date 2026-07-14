class Solution {
    public int[][] merge(List<int[]> ans){
        List<int[]> res=new ArrayList<>();
        int [][] arr= ans.toArray(new int[ans.size()][]);
        int start1=arr[0][0];
        int end1=arr[0][1];
        for(int i=1;i<arr.length;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);

            }
            else{
                res.add(new int[]{start1,end1});
                start1= start2;
                end1=end2;
            }

            
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> copy= new ArrayList<>();
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(insert==false&&start>=newInterval[0]){
                copy.add(newInterval);
                insert=true;
            }
            copy.add(intervals[i]);
            

        }
        if(insert==false)
        {
            copy.add(newInterval);
        }
        return merge(copy);

        
    }
}