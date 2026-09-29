class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        rcount = 1
        idx = 1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1] and rcount <2:
                nums[idx] = nums[i]
                rcount+=1
                idx+=1
            elif nums[i]!=nums[i-1]:
                nums[idx] = nums[i]
                idx+=1
                rcount = 1
            else : 
                continue
        return idx





        