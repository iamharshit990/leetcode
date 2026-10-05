from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        curr_sum = 0
        map =defaultdict(int)
        map[0]+=1
        ans = 0
        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum - k in map:
                ans+= map[curr_sum-k]
            map[curr_sum]+=1
        return ans
        