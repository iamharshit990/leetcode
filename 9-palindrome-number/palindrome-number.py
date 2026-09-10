class Solution:
    def isPalindrome(self, x: int) -> bool:
        n = x
        rev =0
        while(n>0):
            rev = rev*10+n%10
            n//=10
        return x==rev

        