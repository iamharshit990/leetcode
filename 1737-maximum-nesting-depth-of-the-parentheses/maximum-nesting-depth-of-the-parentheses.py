class Solution:
    def maxDepth(self, s: str) -> int:
        count  = 0
        ans = 0
        for ch in s :
            if ch =='(':
                count +=1
                ans = max(count,ans)

            elif ch == ')':
                count-=1
            else :
                ans = max(count,ans)
        return ans

        