class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        target = 0
        ans =[]
        for i in range(len(nums)-2):
            if i>0 and nums[i-1] == nums[i]:
                continue
            low = i+1
            high = len(nums)-1
            while low<high:
                csum = nums[i]+nums[low]+nums[high]
                if csum>target:
                    high-=1
                elif csum<target:
                    low+=1
                else:
                    ans.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while low <high and nums[low]==nums[low-1] :low+=1
                    while low<high and nums[high]==nums[high+1]:high-=1
                    

        return ans

        