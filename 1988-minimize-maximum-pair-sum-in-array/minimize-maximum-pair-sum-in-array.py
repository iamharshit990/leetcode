class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        low = 0
        high = len(nums)-1
        ans = 0
        while low<high:
            ans = max(ans,nums[low]+nums[high])
            low+=1
            high-=1
        return ans

        