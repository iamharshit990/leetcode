from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        pre = 0 
        dic = defaultdict(int)
        dic[0]+=1
        ans = 0
        for i in range(len(nums)):
            pre+=nums[i]
            diff = pre - k
            if diff in dic:
                ans += dic[diff]
            dic[pre]+=1
        return ans

            
        