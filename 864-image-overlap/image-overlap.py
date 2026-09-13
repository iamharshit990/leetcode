class Solution:
    def largestOverlap(self, a: List[List[int]], b: List[List[int]]) -> int:
        n= len(a)
        max_count=0
        def check(a,b,row,col):
            count = 0 
            for i in range(0,len(a)):
                for j in range(0,len(a)):
                    b_i = i+ row
                    b_j = j+ col
                    if(b_i<0 or b_i>=n or b_j>=n or b_j<0):
                        continue
                    else:
                        if(a[i][j]==1 and b[b_i][b_j]==1):
                            count+=1
            return count
                
        for i in range(-n+1,len(a)):
            for j in range(-n+1,len(b)):
                count = check(a,b,i,j)
                max_count = max(max_count,count)
        return max_count

        