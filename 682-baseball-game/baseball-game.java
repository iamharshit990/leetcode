class Solution {
    // most optimal
    public int calPoints(String[] operations) {
        int arr[] = new int[operations.length];
        int index = 0;
        for (String s : operations) {

            if (s.equals("C")) {
                index--;
            }
            else if (s.equals("D")) {
                arr[index] = arr[index - 1] * 2;
                index++;
            }
            else if (s.equals("+")) {
                arr[index] = arr[index - 1] + arr[index - 2];
                index++;
            }
            else {
                arr[index++] = Integer.parseInt(s);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        return sum;
    }
}