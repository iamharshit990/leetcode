class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        i = 0
        j = len(nums) - 1
        ans = [0]*len(nums)
        idx = len(nums)-1
        while i<=j:
            if abs(nums[i]) > abs(nums[j]):
                ans[idx] = nums[i]*nums[i]
                idx-=1
                i+=1
            else:
                ans[idx] = nums[j]*nums[j]
                idx-=1
                j-=1
        return ans

        