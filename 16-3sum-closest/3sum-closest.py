class Solution:
    def threeSumClosest(self, nums: list[int], target: int) -> int:
        nums.sort()
        ans = float('inf')
        diff = float('inf')
        for i in range(len(nums)-2):
            left = i+1
            right = len(nums)-1
            while left<right:
                csum = nums[i]+nums[left]+nums[right]
                if csum>target:
                    cdiff = abs(target-csum)
                    if cdiff<diff:
                        ans = csum
                        diff = cdiff
                    right-=1
                elif csum<target:
                    cdiff = abs(target-csum)
                    if cdiff<diff:
                        ans = csum
                        diff = cdiff
                    left+=1
                else:
                    return csum
        
        return ans
                
                

        