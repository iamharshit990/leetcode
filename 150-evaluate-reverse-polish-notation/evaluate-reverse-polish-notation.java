class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+")&&stack.size()>=2){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(b+a);
            }
            else if(ch.equals("-")&&stack.size()>=2){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(b-a);
            }
            else if(ch.equals("*")&&stack.size()>=2){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(a*b);
            }
            else if(ch.equals("/")&&stack.size()>=2){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(b/a);
            }
            else {
                stack.add(Integer.parseInt(ch));
            }

        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
        
    }
}
