class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        def getRow( n: int) -> list[int]:
            ans = 1
            res = []
            res.append(ans)
            for i in range (1,n+1):
                ans = ans*(n-i+1)
                ans = ans//i
                res.append(ans)
            return res
        
        ans = []
        for i in range (numRows):
            ans.append(getRow(i))
        return ans
        

        