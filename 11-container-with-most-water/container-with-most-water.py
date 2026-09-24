class Solution:
    def maxArea(self, nums: list[int]) -> int:
        ans = 0
        low = 0
        high = len(nums)-1
        while low<high:
            ans = max(ans,min(nums[low],nums[high])*(high-low))
            if nums[high]<nums[low]: high-=1
            else :low+=1
            

        return ans

        