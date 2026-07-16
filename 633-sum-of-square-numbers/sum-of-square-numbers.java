class Solution {
    public boolean judgeSquareSum(int c) {
        //if (c==0||c==1) return false;
        long b = (int)Math.sqrt(c);
        long a=0;
        while(a<=b&&b>=0){
            long sum= (a*a)+(b*b);
            if(sum>c){
                b--;
            }
            else if(sum<c){
                a++;
            }
            else {
                return true;
            }
        }
        return false;
        
    }
}