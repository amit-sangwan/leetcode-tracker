// Last updated: 18/08/2025, 21:13:10
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length ;

        for(int i = 0 ; i < len ; i++){
            int find = target - nums[i] ; 
            for(int j = i+1 ; j < len ; j++){
                if(nums[j] == find){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0} ;
    }
}