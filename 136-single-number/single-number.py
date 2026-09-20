from collections import Counter
class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        dic = Counter(nums)
        for key,val in dic.items():
            if(val==1):
                return key

        