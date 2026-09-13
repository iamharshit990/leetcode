class Solution:
    
    def helper(self,arr,temp,n,idx):
        if(idx==n):
            self.ans.add(tuple(temp.copy()))
            return
        temp.append(arr[idx])
        self.helper(arr,temp,n,idx+1)
        temp.pop()
        self.helper(arr,temp,n,idx+1)
        return self.ans

    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        self.ans = set()
        self.helper(nums,[],len(nums),0)
        return [list(item) for item in self.ans]
        