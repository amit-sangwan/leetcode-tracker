// Last updated: 18/08/2025, 01:52:50
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            int num1 = nums[i];

            for (int j = i + 1; j < l; j++) {
                if (num1 + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}