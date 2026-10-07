class Solution:
    def removeInvalidParentheses(self, s: str) -> list[str]:
        seen = set()
        max_len = 0
        def helper(i, curr, count, s):
            nonlocal max_len
            if count < 0:
                return 
            if i == len(s):
                if count == 0:
                    if len(curr) > max_len:
                        max_len = len(curr)
                        seen.clear()

                    if len(curr) == max_len:
                        seen.add("".join(curr))

                return 
            
            if s[i] not in "()":
                curr.append(s[i])
                helper(i + 1, curr, count, s)
                curr.pop()
                return 
            curr.append(s[i])
            helper(i + 1, curr, count + (1 if s[i] == '(' else -1), s)
            curr.pop()
            helper(i + 1, curr, count, s)
        
        helper(0, [], 0, s)
        return list(seen)
