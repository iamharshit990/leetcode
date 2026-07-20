class Solution {
    public int maxNumberOfBalloons(String text) {
        Map <Character,Integer> bal = new HashMap<>();
        bal.put('b',1);
        bal.put('a',1);
        bal.put('l',2);
        bal.put('o',2);
        bal.put('n',1);
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int res=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e:bal.entrySet()){
            char c= e.getKey();
            int req=e.getValue();
            int have=0;
            if(map.containsKey(c)) have=map.get(c);
            else res=0;
            int times = have/req;
            res=Math.min(res,times);
        }
        return res;
        
    }
}