class Solution {
    public String reverseWords(String s) {
        String trim = s.trim();
        String arr[] = trim.split("\\s+");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(int b=0;b<arr.length;b++)
        {
            sb.append(arr[b]);
            if(b!=arr.length-1) sb.append(" ");
            
        }
        return sb.toString();
    }
}