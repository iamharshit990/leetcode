class Solution {
    public int minimumPushes(String word) {
        int arr[] = new int[26];
        int n = word.length();
        for (int i = 0; i < n; i++) {
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            int cost = (i / 8) + 1;
            sum += arr[i] * cost;

        }
        return sum;

    }
}