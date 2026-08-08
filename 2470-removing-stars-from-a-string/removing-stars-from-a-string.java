class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        int top = 0;

        for (char ch : arr) {
            if (ch == '*') {
                top--;
            } else {
                arr[top++] = ch;
            }
        }

        return new String(arr, 0, top);
    }
}