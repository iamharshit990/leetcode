class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int [] freq = new int[nums.length+1];
        for(int x:nums){
            int rowIdx=freq[x];
            if(rowIdx>= ans.size()) ans.add(new ArrayList<>());
            ans.get(rowIdx).add(x);
            freq[x]++;
        }
        return ans;



        
    }
}