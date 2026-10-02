class Solution:
    def maximumSum(self, nums: list[int]) -> int:
        ans = float('-inf')
        nodelete = float('-inf')
        delete = float('-inf')
        for i in range(len(nums)):
            temp = nodelete 
            nodelete = max(nums[i],nums[i]+nodelete)
            delete = max(temp,delete+nums[i])
            ans = max(ans,max(nodelete,delete))
        return ans


        
        