class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int low=0;
        int high=k-1;
        int index=0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int ans[]= new int [nums.length-k+1];
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int total = 0 ,  beauty=0;
        for(int key:map.keySet()){
            if(key>=0) break;
            total += map.get(key);
            if(total>=x) {beauty = key; break;}
        }
        ans[index++]= beauty;
        low++;
        high++;
        while(high<nums.length){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            map.put(nums[low-1],map.get(nums[low-1])-1);
            if(map.get(nums[low-1])<=0) map.remove(nums[low-1]);

            total=0; beauty=0;
            for(int key : map.keySet()){
                if(key>=0) break;
                total+=map.get(key);
                if(total>=x){ beauty=key; break; }
            }
            ans[index++]=beauty;
            low++;
            high++;
        }
        return ans;

    }
}