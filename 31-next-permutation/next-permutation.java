import java.util.*;

class Solution {
    public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1) {
            reverse(nums,0,nums.length-1);
            return ;
        }
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp = nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        int i=index+1;
        int j=nums.length-1;
        while(i<=j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
        return ;
        
        
    }
}