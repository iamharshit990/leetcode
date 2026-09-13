class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        k=k%n
        nums[0:n] = nums[0:n][::-1]
        nums[0:k] = nums[0:k][::-1]
        nums[k:n] = nums[k:n][::-1]
        