class Solution:
    def kConcatenationMaxSum(self, arr: list[int], k: int) -> int:
        MOD = 10**9 + 7
        def kadane(nums):
            csum = 0
            ans = 0
            for i in range(len(nums)):
                csum = max(nums[i],csum+nums[i])
                ans = max(ans,csum)
            return ans

        sum_arr = sum(arr)
        if k == 1 :return kadane(arr)%MOD
        if sum_arr>0:
            return (kadane(arr+arr) + (k-2)*sum_arr)%MOD
        else:
            return (kadane(arr+arr))%MOD

        