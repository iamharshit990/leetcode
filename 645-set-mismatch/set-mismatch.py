class Solution:
    def findErrorNums(self, nums: list[int]) -> list[int]:
        n=len(nums)
        count = [0]*(n+2)
        for i in nums:
            count[i]+=1
        ans = [0]*2
        for i in range(1,n+1):
            if(count[i]==2):
                ans[0] = i
            elif(count[i]==0):
                ans[1] = i
        return ans


