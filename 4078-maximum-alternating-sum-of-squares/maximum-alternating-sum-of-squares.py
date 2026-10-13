class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i]<0:
                nums[i]*=-1
        
        nums.sort(reverse=True)
        n = len(nums)
        i = 0
        ans  = 0
        j = n-1
        while i<=j:
            if i==j:
                ans +=(nums[i]*nums[i])
                break
            ans+=(nums[i]*nums[i])
            ans-=(nums[j]*nums[j])
            i+=1
            j-=1
        return ans

        