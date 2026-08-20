class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n], b = new int[n];
        int ai = 0, bi = 0;
        a[ai++] = nums[0];
        b[bi++] = nums[1];
        for (int i = 2; i < n; i++) {
            if (a[ai-1] > b[bi-1]) a[ai++] = nums[i];
            else b[bi++] = nums[i];
        }
        int[] res = new int[n];
        int idx = 0;
        for (int k = 0; k < ai; k++) res[idx++] = a[k];
        for (int k = 0; k < bi; k++) res[idx++] = b[k];
        return res;
    }
}