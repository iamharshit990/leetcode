class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        left  = 0
        right = 0
        total = sum(nums)
        for i in range(0,len(nums)):
            if i==0: left =0
            else :left += nums[i-1]
            right = total-left-nums[i]
            if left==right:
                return i
        return -1
        