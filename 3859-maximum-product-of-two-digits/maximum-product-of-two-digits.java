class Solution {
    public int maxProduct(int n) {
        List<Integer> list= new ArrayList<>();
        while(n>0){
            int digit=n%10;
            list.add(digit);
            n/=10;
        }
        Collections.sort(list);
        int[] primitiveArray = list.stream().mapToInt(Integer::intValue).toArray();
        int i=primitiveArray.length;
        return primitiveArray[i-1]*primitiveArray[i-2];
        

        
    }
}