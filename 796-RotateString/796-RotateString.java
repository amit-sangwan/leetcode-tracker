// Last updated: 21/08/2025, 01:05:01
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (String str : arr) {
            System.out.println(str);
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() < 1) {
                continue;
            }
            sb.append(arr[i].trim());
            sb.append(" ");
            System.out.println("***** " + sb + "***** ");

        }
        System.out.println("FINAL::: " + sb + "***** ");

        return sb.toString().trim();
    }
}