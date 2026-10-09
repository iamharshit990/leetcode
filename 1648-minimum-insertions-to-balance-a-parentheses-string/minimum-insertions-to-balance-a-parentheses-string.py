class Solution:
    def minInsertions(self, s: str) -> int:
        ans = 0
        count = 0
        i = 0
        while i<len(s):
            if s[i] == '(':
                count+=1
                i+=1
            else :
                if count>0:
                    count-=1
                else:
                    ans+=1
                
                if i+1<len(s) and s[i+1] == ')':
                    i+=2
                else :
                    ans+=1
                    i+=1
        
        if count>0:
            ans += 2*count
        return ans

        