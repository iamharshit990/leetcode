class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] % k == 0 && nums[i] / k <= n) {
                int correctIdx = (nums[i] / k) - 1; 
                if (nums[i] == nums[correctIdx]) {
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != (i + 1) * k) {
                return (i + 1) * k; 
            }
        }
        return (n + 1) * k;
    }
}
