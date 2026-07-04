class Solution {
    public int reverse(int x) {
        long rev = 0;           // Use long instead of int
        int original = x;
        
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        
        // Cast back to int at the end
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) rev;
    }
}