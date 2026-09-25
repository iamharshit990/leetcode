class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) == 0:
                return ""
        max_length=0
        index=[0]*2
        def helper(s,i,j):
            while i>=0 and j<len(s):
                if s[i]!= s[j]:
                    break
                i-=1
                j+=1
            return [i+1,j-1]
        for i in range (0,len(s)):
            odd_arr = helper(s,i,i)
            even_arr = helper(s,i,i+1)
            odd_length = odd_arr[1]-odd_arr[0]+1
            even_length = even_arr[1]-even_arr[0]+1
            if odd_length>even_length:
                if odd_length>max_length:
                    max_length = odd_length
                    index[0] = odd_arr[0]
                    index[1] = odd_arr[1]
            else:
                if even_length>max_length:
                    max_length = even_length
                    index[0] = even_arr[0]
                    index[1] = even_arr[1]
        return s[index[0]:index[1]+1]



        