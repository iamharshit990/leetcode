class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        xor1=0
        for i in nums:
            xor1=xor1^i
        xor2=0
        for i in range(0,len(nums)+1):
            xor2=xor2^i
        return xor1^xor2


        
        