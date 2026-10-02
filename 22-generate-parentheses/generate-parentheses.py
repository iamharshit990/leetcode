class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        def helper(n,temp,ug,pg):
            if ug==n and pg==n:
                ans.append("".join(temp))
                return 
            if ug==0 or ug<n:
                temp.append('(')
                helper(n,temp,ug+1,pg)
                temp.pop()
            if pg<ug:
                temp.append(')')
                helper(n,temp,ug,pg+1)
                temp.pop()
        
        ans = []
        temp = []
        helper(n,temp,0,0)
        return ans 


       
        