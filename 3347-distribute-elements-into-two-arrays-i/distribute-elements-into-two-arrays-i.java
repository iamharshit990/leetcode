class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        a.push(nums[0]);
        b.push(nums[1]);
        int res[] = new int[nums.length];
        for (int i = 2; i < nums.length; i++) {
            if (a.peek() > b.peek()) {
                a.push(nums[i]);
            } else {
                b.push(nums[i]);
            }
        }
        int index = 0;
        for (int x : a)
            res[index++] = x;
        for (int x : b)
            res[index++] = x;
        return res;

    }
}