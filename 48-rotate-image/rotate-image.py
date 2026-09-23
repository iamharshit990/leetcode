class Solution:
    def rotate(self, arr: list[list[int]]) -> None:
        n = len(arr)
        for i in range(0,n):
            for j in range (0,i):
                arr[i][j],arr[j][i] = arr[j][i],arr[i][j]

        for i in range (len(arr)):
            arr[i].reverse()
        return arr

        