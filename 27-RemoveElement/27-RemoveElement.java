// Last updated: 28/08/2025, 11:02:26
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j += 1 ;
        }

        return j;
    }
}