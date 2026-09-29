from collections import defaultdict
class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        dic = defaultdict(int)
        for i in range(len(nums)):
            diff = target-nums[i]
            if diff in dic:
                return [dic[diff],i]
            
            dic[nums[i]] = i
        return []