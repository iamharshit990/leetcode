class Solution:
    def checkValidString(self, s: str) -> bool:
        open = 0 
        close = 0
        for  i in s:
            if i=='(' or  i=='*':
                open+=1
            else:
                if open>0 : open-=1
                else : return False
        
        for i in range(len(s)-1,-1,-1):
            if s[i]==')' or s[i] == '*':
                close+=1
            else:
                if close>0: close-=1
                else: return False
        
        return True
        