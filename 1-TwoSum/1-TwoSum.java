// Last updated: 31/08/2025, 00:16:38
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Map initiated: " + map);
        for (int i = 0; i < len; i++) {

            int need = target - nums[i];
            System.out.println("Current number: " + nums[i] + " Number Required: " + (target - nums[i]) );
            System.out.println(map.containsKey(need));
            if (map.containsKey(need)) {

                return new int[] { i, map.get(need) };
            }
            map.put(nums[i], i);
            System.out.println("********* End of Loop Cycle *******");
        }
        return new int[] { 0, 0 };

    }
}