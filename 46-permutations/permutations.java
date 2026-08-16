class Solution {
    // sub optimal uses extra space 
    public void helper(List<List<Integer>> ans , int [] arr ,List<Integer> temp, boolean [] freq){
        if(temp.size()== arr.length) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(arr[i]);
                helper(ans,arr,temp,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }
        


    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        helper(ans,nums,temp,freq);
        return ans;
        
    }
}