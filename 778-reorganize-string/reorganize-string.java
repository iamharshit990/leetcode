class Pair {
    char ch;
    int freq;

    Pair(char ch , int freq){
        this.ch= ch;
        this.freq= freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a, b) -> Integer.compare(b.freq, a.freq)
        );
        for(char ch : map.keySet()){
            pq.add(new Pair(ch,map.get(ch)));
        }
        StringBuilder sb= new StringBuilder();
        Pair prev=null;
        while(!pq.isEmpty()||prev!=null){
            if(pq.isEmpty()&&prev!=null){
                return "";
            }
            Pair p = pq.poll();
            sb.append(p.ch);
            p.freq--;
            if(prev!=null){
                pq.add(prev);
                prev=null;
            }
            if(p.freq!=0) {
                prev=p;

            }
        }
        return sb.toString();
        
    }
}