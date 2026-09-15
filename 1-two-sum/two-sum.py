class Solution:
    def twoSum(self, arr: list[int], target: int) -> list[int]:
        map ={}
        for i in range(len(arr)):
            if(target-arr[i] in map):
                return [i,map[target-arr[i]]]
            map[arr[i]] = i
        return[]
        