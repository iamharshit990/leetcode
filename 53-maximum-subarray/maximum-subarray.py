class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        ans = float('-inf')
        best = 0
        for i in range(len(nums)):
            best = max(nums[i],best+nums[i])
            ans = max(best,ans)
        return ans
            

        