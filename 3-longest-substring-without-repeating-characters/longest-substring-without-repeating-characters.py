from collections import defaultdict
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        dic = defaultdict(int)
        low = 0
        high = 0
        ans = 0
        while high<len(s):
            dic[s[high]]+=1
            length = high - low + 1
            while len(dic)<length:
                dic[s[low]]-=1
                if dic[s[low]]==0:
                    del dic[s[low]]
                low+=1
                length = high - low + 1
                
            ans = max(length,ans)
            high+=1
        return ans 
            
            
            




        