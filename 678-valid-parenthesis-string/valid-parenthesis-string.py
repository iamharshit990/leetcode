class Solution:
    def checkValidString(self, s: str) -> bool:
        open_stack = []
        ast_stack = []
        for i in range(len(s)):
            if s[i]=='(':
                open_stack.append(i)
            elif s[i]=='*':
                ast_stack.append(i)
            else:
                if open_stack:
                    open_stack.pop()
                elif ast_stack:
                    ast_stack.pop()
                else:
                    return False
            
        while open_stack and ast_stack:
            if (open_stack[-1]>ast_stack[-1]):
                return False
            
            open_stack.pop()
            ast_stack.pop()
        
        return True if not open_stack else False

        