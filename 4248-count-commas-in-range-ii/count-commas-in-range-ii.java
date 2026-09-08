class Solution {
    public long countCommas(long  n) {
        if(n<1000) return 0;
        long temp=n;
        long base=1000;
        long commasUsed=0;
        while(base<=temp){
            commasUsed+=(temp-base+1);
            base*=1000;
        }
        return commasUsed;
    }
}