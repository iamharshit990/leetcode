class Solution {
    public String removeDuplicates(String s) {
        //"abbaca"
        if(s.length()==1) return s;
        StringBuilder ans = new StringBuilder();
        Stack <Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty()&&stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else stack.push(s.charAt(i));

        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();

        
    }
}