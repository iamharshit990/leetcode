class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : arr) {
            heap.add(i);
            if (heap.size() > k) {
                heap.poll();
            }

        }
        return heap.peek();

    }
}