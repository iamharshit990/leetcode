class Solution:
    def reverseDegree(self, s: str) -> int:
        map = {chr(i): 123 - i for i in range(ord('a'), ord('z') + 1)}
        ans =0
        for i in range (len(s)):
            ans += ( (i+1) * map[s[i]])

        return ans

