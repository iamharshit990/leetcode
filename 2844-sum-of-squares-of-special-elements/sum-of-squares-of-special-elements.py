class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        n = len(nums)
        ans = 0
        for i in range(1,len(nums)+1):
            val = n % i
            if val==0:
                ans+=(nums[i-1]*nums[i-1])
        return ans

        



        