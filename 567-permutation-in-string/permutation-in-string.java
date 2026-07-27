class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int low = 0;
        int high = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        boolean isSame = true;

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                isSame = false;
            }
        }
        if (isSame)
            return true;

        while (high < s2.length()) {
            arr2[s2.charAt(high) - 'a']++;
            arr2[s2.charAt(low) - 'a']--;
            low++;
            high++;

            boolean isMatch = true;
            for (int i = 0; i < 26; i++) {
                if (arr1[i] != arr2[i]) {
                    isMatch = false;

                    break;
                }
            }
            if (isMatch)
                return true;
        }
        return false;

    }
}