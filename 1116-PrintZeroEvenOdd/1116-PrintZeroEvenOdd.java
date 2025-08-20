// Last updated: 20/08/2025, 23:27:21
class Solution {
    public int lengthOfLongestSubstring(String s) {

        /**
        Sliding Window - Two Pointer Approach
        System.out.println("dubbuger");
         
        Input: abcabcbb
         */

        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int leftPointer = 0;
        int target = 1;

        HashSet<Character> set = new HashSet<>();

        for (int rightPointer = 0; rightPointer < len; rightPointer++) {

            if (!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer));
              //  System.out.println("char added " + s.charAt(rightPointer) + " set become: " + set);
                target = Math.max(target, rightPointer - leftPointer + 1);

                continue;
            }

            while (set.contains(s.charAt(rightPointer))) {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
             //   System.out.println("In while , removed : " + s.charAt(leftPointer));

            }
         //   System.out.println("set after , removed : " + set);

            set.add(s.charAt(rightPointer));
         //   System.out.println("set adding 1   : " + set);

            target = Math.max(target, rightPointer - leftPointer + 1);
        //    System.out.println("Target : " + target);

            System.out.println("***** Loop Ended ****");

        }

        return target;
    }
}