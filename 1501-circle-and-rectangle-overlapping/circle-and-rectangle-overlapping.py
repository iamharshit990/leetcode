class Solution:
    def checkOverlap(self, r: int, xc: int, yc: int, x1: int, y1: int, x2: int, y2: int) -> bool:
        xi = 0
        yi=0
        if(x1>xc):
            xi=x1
        elif(x2<xc):
            xi=x2
        else:
            xi=xc
        if(y1>yc):
            yi=y1
        elif(y2<yc):
            yi=y2
        else:
            yi=yc
        dis =  ((xc-xi)**2) + ((yc-yi)**2)
        
        
        if dis<=r*r:
            return True
        return False


        