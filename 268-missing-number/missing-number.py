class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        xor1=0
        # gets the xor for the array itself
        for i in nums:
            xor1=xor1^i
        xor2=0
        # gets the xor for the range 0 to n and as last number is not included we use len(arr)+1
        #i.e to get from 0 to n number we have to use n+1 as 0 to n is n-1 number so we use n+1 to get to n
        for i in range(0,len(nums)+1):
            xor2=xor2^i
        return xor1^xor2


        
        