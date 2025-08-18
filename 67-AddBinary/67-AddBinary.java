// Last updated: 18/08/2025, 12:30:22
class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;

        while (carry > 0 || lenA >= 0 || lenB >= 0) {
            int sum = 0;
            sum += carry;
            System.out.println("index  " + lenA + " : " + lenB);

            if (lenA >= 0) {
                sum += a.charAt(lenA) - '0';
                System.out.println("a  " + a.charAt(lenA));

                lenA--;
            }
            if (lenB >= 0) {
                sum += b.charAt(lenB) - '0';
                System.out.println("b  " + b.charAt(lenB));

                lenB--;
            }
            System.out.println("sum  " + sum);

            sb.append(sum % 2);
            carry = sum / 2;
            System.out.println("append " + sum % 2 + "carry: " + sum / 2);
        }
        return sb.reverse().toString();

    }
}