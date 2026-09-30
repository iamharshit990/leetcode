class Solution:
    def twoSum(self,a: list[int], target: int) -> list[int]:
        low  = 0 
        high = len(a) - 1
        while low<high:
            csum = a[low] + a [high]
            if csum > target:
                high-=1
            elif csum <target:
                low+=1
            else :
                return [low+1,high+1]
        return []
        