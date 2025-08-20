// Last updated: 20/08/2025, 23:30:50
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int leftPointer = 0;
        int target = 1;

        HashSet<Character> set = new HashSet<>();

        for (int rightPointer = 0; rightPointer < len; rightPointer++) {

            while (set.contains(s.charAt(rightPointer))) {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(s.charAt(rightPointer));
            target = Math.max(target, rightPointer - leftPointer + 1);
 
 
        }

        return target;
    }
}