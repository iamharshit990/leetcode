class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        PriorityQueue<Integer> price = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> discount = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : prices) {
            price.add(i);
        }
        for (int i : discounts) {
            discount.add(i);
        }
        int n = discount.size();
        double ans = 0;
        while (!discount.isEmpty() && !price.isEmpty()) {
            ans += price.poll() * ((double) (100 - discount.poll()) / 100);
        }
        while (!price.isEmpty()) {
            ans += price.poll();
        }

        return ans;
    }
}