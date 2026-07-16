class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int max[]=new int[nums.length];
        max[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            max[i]=Math.max(nums[i],max[i-1]);
        }

        int []prefixGcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefixGcd[i]=gcd(nums[i],max[i]);
        }
        Arrays.sort(prefixGcd);
        int low=0;
        int high=prefixGcd.length-1;
        long ans=0;
        while(low<high){
            ans+=(long)gcd(prefixGcd[low],prefixGcd[high]);
            low++;
            high--;

        }
        return ans;
        
        
    }
}

