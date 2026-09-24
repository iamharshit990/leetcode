class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def count(n):
            dig =0
            while(n>0):
                dig+=(n%10)
                n//=10
            return dig
        
        for i in range (len(nums)):
            if (count(nums[i])==i):
                return i
        return -1

        