class Solution {
    public int countValidPrefixes(String s) {

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int c0 = 0;
            int c1 = 0;
            if (i == 0) {
                ans++;
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    c0++;
                } else
                    c1++;
                
            }if (Math.abs(c0 - c1) <= 1)
                    ans++;

        }
        return ans;

    }
}