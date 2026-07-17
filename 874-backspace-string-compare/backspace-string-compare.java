import java.util.Stack;
//slightly more optimised 
class Solution { 
    public boolean backspaceCompare(String s, String t) { 
        Stack<Character> stack1 = new Stack<>(); 
        Stack<Character> stack2 = new Stack<>(); 

        for(int i = 0; i < s.length(); i++){ 
            char c = s.charAt(i); 
            if(!stack1.isEmpty() && c == '#') {
                stack1.pop(); 
            } else { 
                if(c == '#') continue; 
                stack1.push(c); 
            } 
        } 

        for(int i = 0; i < t.length(); i++){ 
            char c = t.charAt(i); 
            if(!stack2.isEmpty() && c == '#') {
                stack2.pop(); 
            } else { 
                if(c == '#') continue; 
                stack2.push(c); 
            }
        } 

        return stack1.toString().equals(stack2.toString()); 
    } 
}
