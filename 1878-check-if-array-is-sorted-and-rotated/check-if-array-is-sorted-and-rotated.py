class Solution:
    def valid(self,index,arr):
        for i in range(index-1,-1,-1):
            if(arr[i]<arr[i-1]):
                return False
        for i in range(index,len(arr)-1):
            if(arr[i]>arr[i+1]):
                return False
        return True


    def check(self, arr: List[int]) -> bool:
        minel = min(arr)
        for i in range(len(arr)):
            if(arr[i]==minel):
                ans = self.valid(i,arr)  
                if ans:
                    return True 
        return False
