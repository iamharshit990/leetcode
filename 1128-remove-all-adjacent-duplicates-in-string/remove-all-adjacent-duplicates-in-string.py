class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack = []
        for i in s:
            if not stack:
                stack.append(i)
                continue
            if stack and i!=stack[-1]:
                stack.append(i)
            else :
                stack.pop()
        return "".join(stack)
                    