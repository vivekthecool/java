package corejava;

import java.util.Objects;
import java.util.Stack;

public class CheckForValidBrackets {
    public static void main(String[] args) {
//        Input: s = "()", Output: true
//        Input: s = "()[]{}", Output: true
//        Input: s = "(]", Output: false
//        Input: s = "({[}]), Output: false"
        Stack<Character> stack = new Stack<>();
        String input = null;
        Boolean check = Boolean.FALSE;

        if(Objects.nonNull(input) && input.trim() != "") {
            for(Character c: input.toCharArray()) {
                if(c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if(c == ')' && stack.lastElement() == '(') {
                    stack.pop();
                } else if(c == '}' && stack.lastElement() == '{') {
                    stack.pop();
                } else if(c == ']' && stack.lastElement() == '[') {
                    stack.pop();
                }
            }
            check = stack.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
        } else {
            check = Boolean.FALSE;
        }
        System.out.println(input + " is: " + (check ? "valid input" : "invalid input"));
    }
}
