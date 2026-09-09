class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        pre = 0
        ans=0
        map={}
        map[0] = 1
        for i in range (len(nums)):
            pre+=nums[i]
            target=pre-k
            if(target in map):
                ans+=map[target]
            map[pre] = map.get(pre,0)+1
        return ans
            
        