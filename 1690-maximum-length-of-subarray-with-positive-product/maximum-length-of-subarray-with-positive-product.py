class Solution:
    def getMaxLen(self, nums: list[int]) -> int:
        # here the pos is for like the length of the positive subarray 
        # neg is the length of the -ve subarray
        ans,pos,neg = 0,0,0
        for i in nums:
            if i>0:
                # since like if we get a positive we can increase the length of pos 
                # and we are increasing the length of the neg as like neg*pos = -ve so if the neg length aint 0 cause if we inc in 0 we would make neg len 1 which is not true as we have a pos number
                pos+=1
                neg = neg+1 if neg!=0 else 0
            elif i<0:
                temp  = pos
                # here neg = 1 + pos as like cause as like in pos we have a pos and pos*neg is neg so we do pos + 1 and in pos we do neg +1 as neg is like neg*curr number is -ve too so we increase here
                pos = neg+1 if neg!=0 else 0 
                neg = 1+temp
            else:
                pos = 0
                neg = 0
            ans = max(ans,pos)
        return ans

        