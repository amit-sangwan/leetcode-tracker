// Last updated: 18/08/2025, 21:40:28
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < len; i++) {

            int find = target - nums[i];

            if (hmap.containsKey(find)) {
                int k = hmap.get(find);
                return new int[] { i, k };
            }
            hmap.put(nums[i], i);

        }

        /*   **** Brute Force ****
             for(int i = 0 ; i < len ; i++){
            int find = target - nums[i] ; 
            for(int j = i+1 ; j < len ; j++){
                if(nums[j] == find){
                    return new int[]{i,j};
                }
            }
        }
        
         */

        return new int[] { 0, 0 };
    }
}