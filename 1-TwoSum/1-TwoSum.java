// Last updated: 18/08/2025, 01:57:19
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length ;

        for (int i = 0; i < l; i++) {
            int n2 = target - nums[i] ;
            for (int j = i + 1; j < l; j++) {
                if (nums[j] == n2) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}