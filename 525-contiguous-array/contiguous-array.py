class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count_zero = 0
        count_one = 0
        ans = 0
        map = {0:-1}
        for  i in range(len(nums)):
            if nums[i] == 0: count_zero+=1
            else: count_one +=1
            diff = count_zero - count_one
            if diff in map:
                ans = max(ans,i-map[diff])
            if diff not in map:
                map[diff] = i
        return ans
        