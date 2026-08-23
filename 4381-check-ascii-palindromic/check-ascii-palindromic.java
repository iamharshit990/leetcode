class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray()){
            int as=(int ) ch;
            String bin = Integer.toBinaryString(as);
            bin=String.format("%8s", bin).replace(' ', '0');
            sb.append(bin);
        }
        int i=0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}