// Last updated: 28/08/2025, 10:32:17
class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1 ;
        }
        if(haystack.equals(needle)){
            return 0;
        }

        int h = haystack.length();
        int n = needle.length();

        for(int i =  0 ; i <= h-n ; i++){
            System.out.println(haystack.substring(i,i+n));
            if(haystack.substring(i,i+n).equals(needle)){
                return i ;
            }
        }
        return 1;

}
}