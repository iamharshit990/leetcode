class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        ans = float('-inf')
        pmax = 1
        pmin = 1
        for i in range(len(nums)):
            c1 = nums[i]
            c2 = pmax*nums[i]
            c3 = pmin*nums[i]
            ans = max(ans,max(c1,max(c2,c3)))
            pmax = max(c1,max(c2,c3))
            pmin = min(c1,min(c2,c3))
        return ans        