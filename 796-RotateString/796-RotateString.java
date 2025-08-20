// Last updated: 21/08/2025, 01:05:25
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
         for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() < 1) {
                continue;
            }
            sb.append(arr[i].trim());
            sb.append(" ");
 
        }
 
        return sb.toString().trim();
    }
}