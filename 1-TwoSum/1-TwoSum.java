// Last updated: 30/08/2025, 18:01:09
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int res[] = new int[2];
        //[2,7,11,15]
        // len  = 4 
        // i < 3
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }

            }

        }
        return res;
    }
}