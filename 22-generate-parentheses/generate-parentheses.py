class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        ans = []
        def helper(temp,open,close,n):
            if open == n and close == n:
                ans.append("".join(temp))
                return 
            
            if open==0 or open<n:
                temp.append('(')
                helper(temp,open+1,close,n)
                temp.pop()
            if open>close:
                temp.append(')')
                helper(temp,open,close+1,n)
                temp.pop()
                return 

            
            

        helper([],0,0,n)
        return ans
        