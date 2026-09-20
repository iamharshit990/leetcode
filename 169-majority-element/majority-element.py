class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        el = 0
        cnt =0
        for i in range (len(nums)):
            if cnt==0:
                cnt=1
                el=nums[i]
            elif nums[i] == el:
                cnt+=1
            else:
                cnt-=1
        cnt=0
        for i in nums:
            if i == el:
                cnt+=1  
        if cnt > len(nums)//2:
            return el
        