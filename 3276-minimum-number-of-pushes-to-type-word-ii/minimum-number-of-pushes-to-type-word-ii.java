class Solution {
    public int minimumPushes(String word) {
        int arr[] = new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        for(int i=0;i< arr.length/2 ;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i+-1];
            arr[arr.length-i-1]=temp;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            int cost=(i/8)+1;
            sum+=cost*arr[i];
        }
        return sum;
        
    }
}