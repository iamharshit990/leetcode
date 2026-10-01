class Solution:
    def maxAbsoluteSum(self, nums: list[int]) -> int:
        min_ans = float('inf')
        max_ans = float('-inf')
        curr_min = 0
        curr_max = 0
        for i in range (len(nums)):
            curr_max = max(curr_max+nums[i],nums[i])
            curr_min = min(curr_min+nums[i],nums[i])
            min_ans = min(curr_min,min_ans)
            max_ans = max(curr_max,max_ans)
        
        ans = max (abs(max_ans),abs(min_ans))
        return ans 

        