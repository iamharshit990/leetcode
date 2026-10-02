class Solution:
    def maxAbsoluteSum(self, nums: list[int]) -> int:
        ans = 0 
        max_sum = float('-inf')
        max_ans = float('-inf')
        min_ans = float('inf')
        min_sum = float('inf')
        for i in range(len(nums)):
            max_sum = max(nums[i],max_sum+nums[i])
            min_sum = min(nums[i],min_sum+nums[i])
            max_ans = max(max_ans,max_sum)
            min_ans = min(min_ans,min_sum)
        return max_ans if max_ans>abs(min_ans) else abs(min_ans)

        