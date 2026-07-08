class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s= new StringBuilder("");
    
        int i=0;
        int j=0;
        int len = word1.length()+word2.length();
        if(word1.length()>word2.length()){
            while(i<word1.length()&&j<word2.length()){
                s.append(word1.charAt(i));
                i++;
                s.append(word2.charAt(j));
                j++;
                

            }
            while(i<word1.length()){
                s.append(word1.charAt(i));
                i++;
            }
        }
        else{ 
             while(i<word1.length()&&j<word2.length()){
                s.append(word1.charAt(i));
                i++;
                s.append(word2.charAt(j));
                j++;
                

            }
            while(j<word2.length()){
                s.append(word2.charAt(j));
                j++;
            }


        }
        String ans = s.toString();
        return ans;
        
    }
}