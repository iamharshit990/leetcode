class Solution:
    def longestConsecutive(self, nums):
        see = set(nums)
        ans = 0
        for i in see:
            if((i-1) in see):
                continue
            else :
                append = 0
                count=0
                while((i+append) in see):
                    count+=1
                    append+=1
                ans = max(ans,count)
        return ans
                    
            