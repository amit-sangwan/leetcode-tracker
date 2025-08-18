// Last updated: 18/08/2025, 23:01:11
class Solution {
    public boolean isValid(String s) {

        int len = s.length();
        if (len < 2)
            return false;

        Stack<Character> stack = new Stack();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.isEmpty())
                return false;

            if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
                continue;
            }
            if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
                continue;

            }
            if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
                continue;

            }
            return false;
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}