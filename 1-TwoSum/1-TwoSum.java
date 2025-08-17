// Last updated: 18/08/2025, 01:51:02
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        int l = nums.length ;

        for (int i = 0; i < l; i++) {
            int num1 = nums[i];

            for (int j = i + 1; j < l; j++) {
                int num2 = nums[j];

                if (num1 + num2 == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
            return null ;
    }
}