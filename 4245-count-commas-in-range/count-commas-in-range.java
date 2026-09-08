class Solution {
    public int countCommas(int n) {
        int x = n;
        int dig = 0;
        while(x>0){
            dig++;
            x/=10;
        }
        if(dig<4) return 0;
        if(n>=1000&&n<=9999){
            return (n-1000) + 1;
        }
        if(n>=10000&&n<=99999){
            return 9000 + (n-10000) +1 ;
        }
        
        if(n==100000) return 99001;
        return dig%3;
        
        
        
    }
}