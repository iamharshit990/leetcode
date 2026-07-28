class Solution {
    public String smallestPalindrome(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                mid = (char) (i + 'a');
            }
            arr[i] /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (arr[i] > 0) {
                sb.append((char) (i + 'a'));
                arr[i]--;
            }
        }
        String half=sb.toString();
        StringBuilder ans= new StringBuilder(half);
        if(mid!=0) ans.append(mid);
        ans.append(new StringBuilder(half).reverse());
        return ans.toString();

    }
}