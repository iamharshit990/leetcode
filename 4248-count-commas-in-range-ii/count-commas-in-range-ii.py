class Solution:
    def countCommas(self, n: int) -> int:
        if (n<1000) : return 0
        temp = n
        base = 1000
        ans = 0
        while(base<=temp):
            ans+=temp-base+1
            base*=1000
        return ans
