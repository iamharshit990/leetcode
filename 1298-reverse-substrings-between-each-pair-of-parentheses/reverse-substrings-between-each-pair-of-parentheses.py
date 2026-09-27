class Solution:
    def reverseParentheses(self, s: str) -> str:
        # optimal and lees algorithm
        arr = [0]*len(s)
        stack = []
        for i in range(len(s)):
            if s[i] =='(':
                stack.append(i)
            
            if s[i] ==')':
                idx = stack.pop()
                arr[idx] = i
                arr[i] = idx
            
        res = []
        i = 0
        direction = 1
        while i<len(s) :
            if s[i] in "()":
                i = arr[i]
                direction = direction*-1
                i= i+direction
            else:
                res.append(s[i])
                i = i + direction

        return "".join(res)
            
        