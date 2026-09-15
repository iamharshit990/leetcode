class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        def rev(arr,i,j):
            while(i<j):
                arr[i] , arr[j] = arr[j] , arr[i]
                i+=1
                j-=1
        
        k=k%n
        rev(nums,0,n-1)
        rev(nums,0,k-1)
        rev(nums,k,n-1)