class Solution:
    def construct2DArray(self, arr: list[int], m: int, n: int) -> list[list[int]]:
        ans = [[ 0 for _ in range(n) ]for _ in range(m)]
        if m*n != len(arr):
            return []

        for i in range(len(arr)):
            row = i//n
            col = i%n
            ans[row][col] = arr[i]
        return ans