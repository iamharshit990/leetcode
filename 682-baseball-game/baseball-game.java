class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String ch :operations){
            if(ch.equals("+")){
                if(stack.size()>=2){
                    int a = stack.pop();
                    int b = stack.pop();
                    int sum=a+b;
                    stack.push(b);
                    stack.push(a);
                    stack.push(sum);
                }
                
            }
            else if(ch.equals("D")){
                int a =stack.peek();
                stack.push(2*a);
            }
            else if(ch.equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(Integer.parseInt(ch));
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
        
    }
}