class Pair {
    int index;
    int count;

    Pair(int i, int c) {
        index = i;
        count = c;
    }
}

class Solution {

    public int count(int arr[]) {
        int c = 0;
        for (int i : arr) {
            if (i == 1)
                c++;
        }
        return c;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.count != b.count)
                        return Integer.compare(b.count, a.count);

                    return Integer.compare(b.index, a.index);
                });
        for (int i = 0; i < mat.length; i++) {
            int ones = count(mat[i]);
            pq.add(new Pair(i, ones));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int ans[] = new int[k];
        int i = k-1;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            ans[i--] = p.index;

        }
        return ans;

    }
}