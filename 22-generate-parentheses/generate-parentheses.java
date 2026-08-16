class Solution {
    public static void helper (int open, int close,StringBuilder sb,List<String>ans,int n){
        if(open==n&&close==n) {
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            helper(open+1,close,sb,ans,n);
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        if(close<open){
            sb.append(')');
            helper(open,close+1,sb,ans,n);
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return;

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(0,0,sb,ans,n);
        return ans;
    }
}