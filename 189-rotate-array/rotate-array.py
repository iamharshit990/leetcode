class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        k=k%n
        def rev(i,j,arr):
            while i<j:
                arr[i] , arr[j] = arr[j] , arr[i]
                i+=1
                j-=1
        rev(0,n-1,nums)
        rev(0,k-1,nums)
        rev(k,n-1,nums)

