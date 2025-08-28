// Last updated: 28/08/2025, 09:57:28
class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        if(needle.equals(haystack)){
            return 0;
        }

        return haystack.indexOf(needle);
  
}
}