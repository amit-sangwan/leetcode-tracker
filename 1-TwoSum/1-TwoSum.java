// Last updated: 18/08/2025, 01:51:50
class Solution {
    public int[] twoSum(int[] nums, int target) {

     
        int l = nums.length ;

        for (int i = 0; i < l; i++) {
            int num1 = nums[i];

            for (int j = i + 1; j < l; j++) {
                int num2 = nums[j];

                if (num1 + num2 == target) {
                   return new int[] {i,j};
                }
            }
        }
            return null ;
    }
}