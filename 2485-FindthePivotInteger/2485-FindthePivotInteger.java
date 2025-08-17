// Last updated: 18/08/2025, 00:42:48
class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int pi = (int) Math.sqrt(sum);
        if (pi * pi == sum) {
            return pi;
        }
        return -1;
    }
}