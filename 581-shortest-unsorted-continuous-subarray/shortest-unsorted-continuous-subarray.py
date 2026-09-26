class Solution:
    def findUnsortedSubarray(self, nums: list[int]) -> int:
        end = -1
        peak = nums[0]
        for i in range(len(nums)):
            if peak<=nums[i]:
                peak = nums[i]

            else:
                end = i
        
        floor = nums[len(nums)-1]
        start  = -1
        for i in range(len(nums)-1,-1,-1):
            if floor < nums[i]:
                start   = i
            else :
                floor = nums[i]
        if end == - 1 or start == - 1 :
            return 0
        return end - start +1


        