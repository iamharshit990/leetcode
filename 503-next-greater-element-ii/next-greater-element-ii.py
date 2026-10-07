class Solution:
    def nextGreaterElements(self, nums: list[int]) -> list[int]:
        if len(nums)<2: return [-1]
        stack = []
        for i in range(len(nums)-1,-1,-1):
            stack.append(nums[i])
        
        ans = [-1]*len(nums)
        for i in range(len(nums)-1,-1,-1):
            while stack and stack[-1]<=nums[i]:
                stack.pop()
            if not stack:
                ans[i] = -1
            else:
                ans[i] = stack[-1]
            stack.append(nums[i])
        return ans


        
        