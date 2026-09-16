import math 
class Solution:
    def minEatingSpeed(self, arr: list[int], h: int) -> int:
        def helper(mid , arr ,h):
            count =0
            for i in arr:
                count += math.ceil((i/mid))
            if count<=h:
                return True
            else :
                return False

        n = len(arr)
        low = 1
        high = max(arr)

        while(low<=high):
            mid=(low+high)//2
            if(helper(mid,arr,h)):
                ans = mid
                high=mid-1
            else :
                low = mid+1
        return ans
        
        