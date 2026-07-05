class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        
        int i=0;
        int n=nums.length;
        while(i<n){
            int j=i+1;
            while(j<n){
                int start=j+1;
                int end = n-1;
                long sum=0;
                while(start<end){
                   
                    sum=(long)nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum==target){
                        List<Integer> ians=new ArrayList<>();
                        ians.add(nums[i]);
                        ians.add(nums[j]);
                        ians.add(nums[start]);
                        ians.add(nums[end]);
                        ans.add(ians);
                        start++;
                        end--;
                    }else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }   
                    
                    
                    

                }
                j++;
            }
            i++;

        }
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
        
    }
}