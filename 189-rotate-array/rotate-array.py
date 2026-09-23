class Solution:
    def rotate(self, arr: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(arr)
        def rev(arr,i,j):
            while(i<=j):
                arr[i] , arr[j] = arr[j] , arr[i]
                i+=1
                j-=1
        
        k=k%n
        
        rev(arr,0,n-1)
        rev(arr,0,k-1)
        rev(arr,k,n-1)