class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        low = 0
        high = int(math.sqrt(c))
        while low<=high:
            ans  = (low*low) + (high*high)
            if ans == c:
                return True
            elif ans>c:
                high-=1
            else:
                low+=1
        return False


        