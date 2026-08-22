class Solution {
    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }

    public int mul(int n) {
        int mul = 1;
        while (n > 0) {
            int dig = n % 10;
            mul *= dig;
            n /= 10;
        }
        return mul;
    }

    public boolean checkDivisibility(int n) {
        int ans = sum(n) + mul(n);
        if(n%ans==0) return true;
        else return false;
        
    }
}