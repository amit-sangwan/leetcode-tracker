// Last updated: 21/08/2025, 00:17:20
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;

        char a ;
        char b ;
        int j = len-1 ;
        for (int i = 0; i < len/2; i++) {
            a = s[i];
            b = s[j];
            System.out.println(s[i] + " " + s[j]);
            s[i] = b;
            s[j] = a;
            System.out.println(s[i] + " " + s[j]);
            j = j-1 ;
        }

        for (char c : s) {
            System.out.print(c);
        }

    }
}