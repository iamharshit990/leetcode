class Solution:
    def numberOfSubarrays(self, nums: list[int], k: int) -> int:
        high =0
        ans =0
        prefix_map = {0:1}
        count = 0
        while high<len(nums):
            if nums[high] %2 != 0:
                count+=1
            target = count - k
            if target in prefix_map:
                ans+=prefix_map[target]
            prefix_map[count] = prefix_map.get(count,0)+1
            high +=1
        return ans
            