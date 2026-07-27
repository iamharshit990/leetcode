class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int low=0;
        int high=s1.length();
        int[] arr1= new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i) -'a']++;
        }
        while(high<=s2.length()){
            int arr2[]= new int[26];
            boolean isMatch= true;
            for(int i=low;i<high;i++){
                arr2[s2.charAt(i)-'a']++;
            }
            int index=0;
            for(int i=0;i<26;i++){
                if(arr1[i]!=arr2[i]){
                    isMatch=false;
                    low++;
                    high++;
                    break;
                }
            }
            if(isMatch) return true;
        }
        return false;

        
    }
}