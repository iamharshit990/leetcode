class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        # optimal without stack 
        depth = 0
        score = 0
        for i in range(len(s)):
            if s[i]=='(':
                depth+=1
            else:
                depth-=1
                if s[i-1]=='(':
                    score += 1<<depth #basically it is 2^depth we are doing it with but manipulation  not to like calucalte too much 

        return score 
        