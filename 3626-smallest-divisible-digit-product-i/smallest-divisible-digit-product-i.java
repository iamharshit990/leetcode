class Solution {
    public int prd(int n){
        int sum=1;
        while(n>0){
            sum*=n%10;
            n/=10;

        }
        return sum;
    }

    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            if(prd(i)%t==0) return i;
        }
        
        return 0;
    }
}