class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        depth = 0
        ans = []
        for i in s :
            if i=='(':
                if depth>0:
                    ans.append(i)
                depth+=1
            elif i == ')':
                depth-=1
                if depth>0:
                    ans.append(i)
                    


        return "".join(ans)
