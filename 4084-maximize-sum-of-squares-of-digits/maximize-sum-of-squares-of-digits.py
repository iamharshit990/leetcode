class Solution:
    def maxSumOfSquares(self, num: int, ssum: int) -> str:
        ans = []
        if num*9<ssum:
            return ""
        nines = ssum//9
        rem = ssum%9
        while len(ans)<num and nines>0:
            ans.append('9')
            nines-=1
        if rem>0 and len(ans)<num:
            ans.append(str(rem))
            rem-=1
        while len(ans)<num:
            ans.append('0')
        
        return "".join(ans)



        
        
        