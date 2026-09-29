class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        low = 0
        high = len(nums)-1
        while low<high:
            csum=nums[low]+nums[high]
            if csum>target:
                high-=1
            elif csum<target:
                low+=1
            else :
                return [low+1,high+1]
            
        return []


        