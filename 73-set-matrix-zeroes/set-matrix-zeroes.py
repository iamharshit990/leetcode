class Solution:
    def setZeroes(self, arr):
        n = len(arr)
        m = len(arr[0])
        col = 1
        for i in range(n):
            for j in range(m):
                if arr[i][j] ==0:
                    arr[i][0] = 0
                    if j!=0 :
                        arr[0][j]=0
                    else:
                        col=0
        for i in range(1,n):
            for j in range (1,m):
                if arr[i][0] ==0 or arr[0][j]==0:
                    arr[i][j]=0
                
        if arr[0][0] ==0:
            for i in range(len(arr[0])):
                arr[0][i]= 0
        if col==0:
            for i in range(len(arr)):
                arr[i][0]=0
                

            

    
