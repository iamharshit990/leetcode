from collections import defaultdict

class Solution:
    def subarraysWithKDistinct(self, nums: list[int], k: int) -> int:
        def atMostK( nums, k):
            dic = defaultdict(int)
            low = 0
            ans = 0
        
            for high in range(len(nums)):
                dic[nums[high]] += 1
            
                while len(dic) > k:
                    dic[nums[low]] -= 1
                    if dic[nums[low]] == 0:
                        del dic[nums[low]]
                    low += 1
                
                ans += (high - low + 1)
            
            return ans
        return atMostK(nums, k) - atMostK(nums, k - 1)

    
