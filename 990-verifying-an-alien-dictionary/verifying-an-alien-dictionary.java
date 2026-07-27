class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            map.put(ch, i);
        }
        for (int i = 1; i < words.length; i++) {
            String current = words[i];
            String prev = words[i - 1];
            int ci = 0;
            int pi = 0;
            boolean used = false;
            while (ci < current.length() && pi < prev.length()) {
                if (map.get(current.charAt(ci)) > map.get(prev.charAt(pi))) {
                    ci++;
                    pi++;
                    used = true;
                    break;
                }
                else if (map.get(current.charAt(ci)) == map.get(prev.charAt(pi))) {
                    ci++;
                    pi++;
                    continue;
                } 
                else{
                    return false;
                }
            }
            if (!used) {
                if (current.length() < prev.length()) return false;
            }
        }
        return true;

    }
}