class Solution:
    def largestRectangleArea(self, nums: list[int]) -> int:
        if len(nums) == 1 :
            return nums[0]
        if len(nums) == 2:
            choice1 = max(nums[0],nums[1])
            choice2 = min(nums[0],nums[1])*2
            return max(choice1,choice2)

        stack = []
        ans = 0
        stack.append(0)
        left = [0]*len(nums)
        left[0] = -1
        for i in range(1,len(nums)):
            while stack and nums[stack[-1]]>=nums[i]:
                stack.pop()
            if not stack:
                left[i] = -1 
            else:
                left[i] = stack[-1]
        
            stack.append(i)
        
        stack = []
        stack.append(len(nums)-1)

        right = [0]*len(nums)
        right[len(nums)-1] = -1
        for  i in range(len(nums)-2,-1,-1):
            while stack and nums[stack[-1]]>=nums[i]:
                stack.pop()
            if not stack:
                right[i] = -1
            else:
                right[i] = stack[-1]
            stack.append(i)
        
        for i in range(len(nums)):
            if left[i] == -1 and right[i]== -1:
                choice = nums[i]*len(nums)
                ans = max(ans,choice)
            elif left[i] == -1:
                width = right[i]
                choice = nums[i]*width
                ans = max(ans,choice)
            elif right[i] == -1:
                width = len(nums) - left[i] - 1 
                choice = nums[i]*width 
                ans = max(ans,choice)
            else:
                width = right[i] - left[i] - 1
                choice = nums[i]*width 
                ans = max(ans,choice)
        return ans 






        
        

        



        