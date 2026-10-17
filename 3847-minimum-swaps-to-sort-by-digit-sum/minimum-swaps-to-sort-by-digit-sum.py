from functools import cmp_to_key

class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        def digitsum(n):
            ans = 0
            while n > 0:
                ans += n % 10
                n //= 10
            return ans

        ds = {x: digitsum(x) for x in nums}

        def compare(a, b):
            if ds[a] != ds[b]:
                return ds[a] - ds[b]
            return a - b

        arr = nums.copy()
        nums.sort(key=cmp_to_key(compare))

        pos = {nums[i]: i for i in range(len(nums))}

        swaps = 0
        for i in range(len(nums)):
            while arr[i] != nums[i]:
                curr = arr[i]
                idx = pos[curr]

                arr[i], arr[idx] = arr[idx], arr[i]
                pos[curr] = idx
                pos[arr[idx]] = i
                swaps += 1

        return swaps