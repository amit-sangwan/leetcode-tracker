// Last updated: 19/08/2025, 13:15:35
class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < len; i++) {
            System.out.println("*************");
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                System.out.println("Item pushed: " + s.charAt(i));

                stack.push(s.charAt(i));
                continue;
            }
            System.out.println(stack);

            if (stack.isEmpty()) {
                return false;
            }
            if (s.charAt(i) == ')') {
                System.out.println("Compared: " + s.charAt(i) + " Item popped: " + stack.peek());
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                System.out.println("Compared: " + s.charAt(i) + " Item popped: " + stack.peek());
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
             }
            if (s.charAt(i) == '}') {
                System.out.println("Compared: " + s.charAt(i) + " Item popped: " + stack.peek());
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