class Solution:
    def reverseParentheses(self, s: str) -> str:
        stack = []
        for ch in s:
            if ch != ')':
                stack.append(ch)
            
            else:
                temp = []
                while stack and stack[-1] !='(':
                    temp.append(stack.pop())
                
                if stack : stack.pop()
                for i in temp:
                    stack.append(i)


        return "".join(stack)
            
        