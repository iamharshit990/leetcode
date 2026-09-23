class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        ans = 0
        count =0
        for i in nums:
            if i ==1 :
                count+=1
                ans = max(count,ans)
            else:
                count=0

        return ans
            
        