class Solution:
    def minOperations(self, s: str) -> int:
        is_sorted = True
        n = len(s)
        for i in range(1,len(s)):
            if s[i]<s[i-1]:
                is_sorted = False
                break
        if is_sorted : return 0

        if len(s)==2: return -1

        max_char = max(s)
        min_char = min(s)
        if max_char == s[n-1] or min_char==s[0]:
            return 1
        
        target_range = s[1:n-1]
        max_mid = max(target_range)
        min_mid = min(target_range)
        if s[0]>max_mid and s[n-1]<min_mid:
            return 3
        
        return 2
                
        