// Last updated: 18/08/2025, 01:32:25
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0 ;
        int leftSum = 0;
        int rightSum = 0;

        for(int i : nums){
            totalSum += i;
        }

        for(int counter = 0 ; counter < nums.length ; counter ++){
            rightSum = totalSum - leftSum - nums[counter];

            if(rightSum == leftSum ){
                return counter ;
            }
            leftSum += nums[counter];
        }
        return -1 ;

    }
}