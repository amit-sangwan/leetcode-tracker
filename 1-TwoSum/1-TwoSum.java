// Last updated: 18/08/2025, 01:56:51
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int n2 = target - nums[i] ;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == n2) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}