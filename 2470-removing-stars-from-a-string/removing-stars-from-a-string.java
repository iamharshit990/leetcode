class Solution {
    public String removeStars(String s) {
        char [] arr= s.toCharArray();
        int index=0;
        for(char ch : arr){
            if(ch=='*'){
                index--;
            }
            else {
                arr[index++]=ch;
            }
        }
        return new String(arr,0,index);
    }
}