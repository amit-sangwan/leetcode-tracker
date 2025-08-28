// Last updated: 28/08/2025, 10:06:56
class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        if (needle.equals(haystack)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {

            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j)==needle.charAt(j)) {
                j += 1;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return 1;
    }
}