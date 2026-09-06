class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int size = arr[i];
            // Get or create the active group for this size
            List<Integer> currentGroup = map.computeIfAbsent(size, k -> new ArrayList<>());
            currentGroup.add(i);
            if (currentGroup.size() == size) {
                result.add(currentGroup);
                map.remove(size);
            }
        }
        
        return result;
    }
}
