class Solution:
    def maxSubarraySumCircular(self, nums: list[int]) -> int:
        cbest = float('-inf')
        best = float('-inf')
        worst = float('inf')
        cworst = float('inf')
        sum_array = 0
        for i in range(len(nums)):
            cbest = max(nums[i],cbest+nums[i])
            best = max(best,cbest)
            cworst = min(nums[i],cworst+nums[i])
            worst = min(cworst,worst)
            sum_array+=nums[i]
        
        choice2 = sum_array-worst
        if best<0:  return best
        return best if best>choice2 else choice2


        