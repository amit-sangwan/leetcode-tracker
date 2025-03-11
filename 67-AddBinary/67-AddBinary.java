class Solution {
    public String addBinary(String a, String b) {

        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (aLen >= 0 || bLen >= 0) {
            int i = 0;
            int j = 0;

            if (aLen >= 0)
                i = Character.getNumericValue(a.charAt(aLen));
            if (bLen >= 0)
                j = Character.getNumericValue(b.charAt(bLen));

            int sum = carry + i + j;

            if (sum >= 2) {
                carry = sum / 2;
                sb.append(sum % 2);
            } else {
                carry = 0;
                sb.append(sum);
            }
            aLen--;
            bLen--;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}