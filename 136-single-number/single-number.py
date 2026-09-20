from collections import Counter
class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        x = 0
        for i in nums:
            x=x^i
        return x

        