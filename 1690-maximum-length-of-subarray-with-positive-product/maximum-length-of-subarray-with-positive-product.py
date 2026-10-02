class Solution:
    def getMaxLen(self, nums: list[int]) -> int:
        ans , pos, neg = 0,0,0
        for i in nums:
            if i>0:
                pos+=1
                neg+=1 if neg!=0 else 0 
            elif i<0:
                temp = pos
                pos=neg+1 if neg!=0 else 0
                neg = temp+1
            else :
                pos = 0
                neg = 0
            ans = max(ans,pos)
        return ans
        