class Solution {
    public void merge(int l[], int r[], int arr[]) {
        int lsize = l.length;
        int rsize = r.length;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < lsize && j < rsize) {
            if (l[i] <= r[j]) { 
                arr[index] = l[i];
                i++;
            } else {
                arr[index] = r[j];
                j++;
            }
            index++; 
        }
        while (i < lsize) {
            arr[index] = l[i];
            i++;
            index++;
        }
        while (j < rsize) {
            arr[index] = r[j];
            j++;
            index++;
        }
    }

    public void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;
        int mid = (n / 2);
        int l[] = new int[mid];
        int r[] = new int[n - mid];
        int i = 0;
        int j = 0;
        for (; i < n; i++) {
            if (i < mid) {
                l[i] = arr[i];
            } else {
                r[j++] = arr[i];
            }
        }
        mergeSort(l);
        mergeSort(r);
        merge(l, r, arr);

    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}