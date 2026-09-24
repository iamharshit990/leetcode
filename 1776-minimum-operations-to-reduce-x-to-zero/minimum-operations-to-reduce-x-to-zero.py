class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        low = 0
        high = 0
        sum_arr = 0
        ans =  -1
        target = sum(nums) - x
        if target<0: return -1
        while (high<len(nums)):
            sum_arr+=nums[high]
            while(sum_arr>target):
                sum_arr-=nums[low]
                low+=1
            if(sum_arr==target):
                length = high-low+1
                ans = max(ans,length)
            high+=1
        return len(nums)-ans if ans !=-1 else -1


        