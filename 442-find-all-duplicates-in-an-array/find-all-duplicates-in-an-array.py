class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        ans=[]
        for i in nums:
            val = abs(i)
            if nums[val-1]<0:
                ans.append(val)
            else:
                nums[val-1]*=-1
        return ans
        