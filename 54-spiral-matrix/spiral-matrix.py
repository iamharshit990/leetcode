class Solution:
    def spiralOrder(self, arr):
        n = len(arr)
        m = len(arr[0])
        ans=[]
        top = 0 
        bottom = n-1
        left = 0 
        right = m-1
        while(left<=right and top <= bottom):
            for i in range (left , right+1):
                ans.append(arr[top][i])
            top+=1
            for i in range (top,bottom+1):
                ans.append(arr[i][right])
            right-=1
            if top<=bottom:
                for i in range (right,left-1,-1):
                    ans.append(arr[bottom][i])
                bottom-=1
            if left<=right:
                for i in range (bottom,top-1,-1):
                    ans.append(arr[i][left])
                left+=1
        return ans
        