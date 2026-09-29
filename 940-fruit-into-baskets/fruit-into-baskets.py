from collections import defaultdict
class Solution:
    def totalFruit(self, arr: list[int]) -> int:
        dic = defaultdict(int)

        low = 0 
        ans = 0 
        high = 0
        while high<len(arr):
            dic[arr[high]]+=1
            while len(dic)>2:
                dic[arr[low]]-=1
                if dic[arr[low]]==0:
                    del dic[arr[low]]
                low+=1
            
            ans = max (high-low+1,ans)
            high+=1
        return ans
        


        