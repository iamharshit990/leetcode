class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        low = 0 
        high =0
        rsum = 0
        ans = float('inf')
        while high<len(nums):
            rsum+=nums[high]
            while rsum>=target:
                ans = min(ans,high-low+1)
                rsum-=nums[low]
                low+=1
                #ans = min(ans,high-low+1)
            high+=1
        if ans != float('inf'):
            return ans
        else:
            return 0


        