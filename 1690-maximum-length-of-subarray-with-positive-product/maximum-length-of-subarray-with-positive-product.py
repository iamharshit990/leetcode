class Solution:
    def getMaxLen(self, nums: list[int]) -> int:
        ans = -1
        plen = 0
        nlen = 0
        for i in range(len(nums)):
            if nums[i]>0:
                if nlen!=0: nlen = nlen+1
                else : nlen = 0
                
                plen+=1
            if nums[i]<0:
                if nlen!=0: newp = nlen+1
                else: newp=0
                newn = plen+1
                plen , nlen = newp,newn
                
            elif nums[i]==0 :
                plen=0
                nlen=0
            ans = max(ans,plen)
                
        return ans

        