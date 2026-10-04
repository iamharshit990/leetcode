class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        n = len(nums)
        left = [0]*len(nums)
        right = [0]*len(nums)
        left[0] = 0
        right[n-1] = 0
        for i in range(1,len(nums)):
            left[i] = left[i-1] + nums[i-1]
        
        for i in range(len(nums)-2,-1,-1):
            right[i] = right[i+1]+nums[i+1]

        for i in range(len(nums)):
            if left[i] == right[i]:
                return i
        return -1



        