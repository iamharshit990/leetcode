class Solution:
    def maxSum(self, nums: List[int], k: int) -> int:
        MOD = 10**9+7
        count = [0]*32
        for i in nums:
            for b in range(32):
                if i & (1<<b):
                    count[b]+=1
        result = 0
        while k>0:
            curr = 0
            for b in range(len(count)):
                if count[b]>0:
                    count[b]-=1
                    curr = curr | (1<<b)

            k-=1
            result+=(curr*curr)
        return result%MOD


        