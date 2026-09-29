class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        nums.sort()
        low = 0
        high = len(nums)-1
        ans = 0
        while low<=high:
            csum = nums[low] + nums[high]
            if csum < target:
                ans += high - low
                low+=1
            else :
                high-=1
        return ans


        