class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        int low = 0;
        int high = 9;
        while (high < s.length()) {
            String dna = s.substring(low, high + 1);
            if (set.contains(dna)) {
                seen.add(dna);
            }
             
            set.add(dna);
            low++;
            high++;
        }
       
        return new ArrayList<>(seen);
    }
}