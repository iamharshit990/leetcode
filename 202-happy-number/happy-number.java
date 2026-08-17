class Solution {
    public int helper(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=(dig*dig);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=helper(slow);
            fast=helper(fast);
            fast=helper(fast);
            if(slow==fast&&slow!=1){
                return false;
            }
        }
        return true;
        
    }
}