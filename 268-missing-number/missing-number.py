class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        expsum = n*(n+1)//2
        return expsum - sum(nums)
        