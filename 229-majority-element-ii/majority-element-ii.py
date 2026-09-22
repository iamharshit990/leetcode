class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        n= len(nums)
        a=0
        b=0
        cnt1=0
        cnt2=0
        for i in nums:
            if (cnt1==0 and i!=b):
                a = i
                cnt1=1
            elif (cnt2==0 and i!=a):
                b=i
                cnt2=1
            elif i==a:
                cnt1+=1
            elif i==b:
                cnt2+=1
            else:
                cnt1-=1
                cnt2-=1
        x=0
        y=0
        for i in nums:
            if(i==a):
                x+=1
            elif(i==b):
                y+=1
        if (x>n//3 and y>n//3 ):
            return [a,b]
        if (x>n//3):
            return [a]
        if y>n//3:
            return [b]
        else:
            return []


        