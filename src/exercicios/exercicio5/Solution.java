package exercicios.exercicio5;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String validString = "({[]})";
        String invalidString = "([{}())]";
        
        boolean isValid1 = solution.isValid(validString);
        boolean isValid2 = solution.isValid(invalidString);
        
        System.out.println("A string '" + validString + "' é válida? " + isValid1);
        System.out.println("A string '" + invalidString + "' é válida? " + isValid2);
    }

}
