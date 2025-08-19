// Last updated: 19/08/2025, 13:16:05
class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {

                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            if (s.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;

    }
}