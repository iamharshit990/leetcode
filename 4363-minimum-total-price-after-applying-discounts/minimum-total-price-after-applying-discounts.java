class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < discounts.length) {
                total += prices[prices.length - 1 - i] * (100 - discounts[discounts.length - 1 - i]) / 100.;
            } else {
                total += prices[prices.length - 1 - i];
            }
        }
        return total;
    }
}