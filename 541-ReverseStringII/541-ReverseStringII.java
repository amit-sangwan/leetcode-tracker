// Last updated: 21/08/2025, 00:41:28
class Solution {
    public String reverseStr(String s, int k) {

        String[] parts = s.split("(?<=\\G.{" + k + "})");

        StringBuilder sb = new StringBuilder();
        int i = 2;
        for (String str : parts) {
            if (i % 2 == 0) {
                sb.append(rev(str));
            } else {
                sb.append(str);

            }
            i++;

        }
        return sb.toString();
    }

    public String rev(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}