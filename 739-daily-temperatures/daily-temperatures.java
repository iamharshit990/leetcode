class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack <Integer> stack= new Stack<>();
        ans[n-1]=0;
        stack.push(n-1);
        //[73,74,75,71,69,72,76,73]    stack 7            ans =                       0
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] = 0;
            else ans[i]=Math.abs(i-stack.peek());
            stack.push(i);

        } 
        return ans;
    }
}