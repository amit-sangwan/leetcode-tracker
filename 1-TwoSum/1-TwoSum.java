import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the difference and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference between the target and the current number
            int difference = target - nums[i];
            
            // Check if the difference exists in the hash map
            if (numMap.containsKey(difference)) {
                // If it exists, return the indices
                return new int[] { numMap.get(difference), i };
            }
            
            // Otherwise, add the current number and its index to the hash map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found (though the problem guarantees one), return an empty array
        return new int[] {};
    }
}