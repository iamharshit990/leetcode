class Solution:
    def reverse(self, n: int) -> int:
        x = abs(n)
        rev =0

        while(x>0):
            dig = x%10
            rev=rev*10+dig
            x//=10
        if(rev>=(2**31)-1): return 0
        if n<0 :
            
            return -1*rev
        return rev
        