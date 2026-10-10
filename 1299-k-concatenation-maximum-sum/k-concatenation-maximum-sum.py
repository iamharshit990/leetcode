class Solution:
    def kConcatenationMaxSum(self, arr: list[int], k: int) -> int:
        n = len(arr)
        MOD = 10**9+7
        def kadane(reps):
            ans = 0
            curr= 0
            for i in range(n*reps):
                val = arr[i%n]
                curr = max(val,curr+val)
                ans = max(ans,curr)
            
            return ans
        
        if k==1:
            return kadane(1)%MOD
        
        if sum(arr)>0:
            return ((k-2)*sum(arr) + kadane(2))%MOD
        else:
            return kadane(2)%MOD

