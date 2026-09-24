class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)==0 :
            return ""
        max_length = 0
        index = [0]*2
        def helper(s,left,right):
            while left>=0 and right<len(s):
                if s[left]!=s[right]:
                    break
                left-=1
                right+=1
            return [left+1,right-1]

        for i in range(len(s)):
            odd_res = helper(s,i,i)
            even_res=helper(s,i,i+1)
            odd = odd_res[1] - odd_res[0]+1
            even = even_res[1] - even_res[0]+1
            if odd > even:
                if odd>max_length:
                    max_length=odd
                    index[0] = odd_res[0]
                    index[1] = odd_res[1]
            else:
                if even>max_length:
                    max_length=even
                    index[0] = even_res[0]
                    index[1] = even_res[1]

        return s[index[0]:index[1]+1]

