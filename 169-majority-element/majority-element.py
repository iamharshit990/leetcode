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
        # if it is given that there always exists the majority element
        return el
        