import java.util.Stack;
class Solution {
    boolean solution(String s) {
        /* if(!s.startsWith("(")) {
            return false;
        }
        else if(!s.endsWith(")")) {
            return false;
        } */
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}