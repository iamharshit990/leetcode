class Solution:
    def numSubarraysWithSum(self, nums: list[int], k: int) -> int:
        map ={0:1}
        ans = 0
        curr = 0
        for i in range(len(nums)):
            curr+=nums[i]
            diff = curr-k
            if diff in map:
                ans+=map[diff]
            map[curr] = map.get(curr,0)+1
        return ans
        
        