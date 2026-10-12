class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        # brute 
        for i in range(1,len(s)//2+1):
            if len(s)%i==0:
                times = len(s)//i
                pattern = times*s[0:i]
                if pattern == s:
                    return True
        return False
        