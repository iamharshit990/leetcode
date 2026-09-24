class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        i = 0 
        j = len(nums)-1
        while i<j:
            curr = nums[i] + nums[j]
            if curr>target:
                j-=1
            elif curr<target:
                i+=1
            else:
                return [i+1,j+1]
        return []
        