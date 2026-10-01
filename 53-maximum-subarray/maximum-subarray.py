class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        if len(nums)==1:return nums[0]
        ans = float('-inf')
        cans = 0
        for i in range(0,len(nums)):
            choice1 = cans+nums[i]
            choice2 = nums[i]
            cans = max(choice1,choice2)
            ans = max(ans,cans)
        return ans


        