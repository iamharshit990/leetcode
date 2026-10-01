class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        ans = nums[0]
        cans = nums[0]
        for i in range(1,len(nums)):
            choice1 = cans+nums[i]
            choice2 = nums[i]
            cans = max(choice1,choice2)
            ans = max(ans,cans)
        return ans


        