//Brute force: Use two loops and iterate through the entire array to look for the sum of two indices.
//SC: O(N*N)
//TC: O(1)

//Optimized approach: Using hashmap, iterate through the entire array looking for difference between (target) - (element at current index position). If difference does not exist, store the difference: index in the hashmap as key:value pair. And if found return indices of already existing element and difference in array.  
//SC: O(n)
//TC: O(n)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // declaring a hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        // required output
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                result[0] = map.get(number);
                result[1] = i;
            }
            // to keep going through loop and add in hashmap
            map.put(nums[i], i);
        }
        return result;
    }
    
    
    
      public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test Case 1: Indices of the two numbers that add up to " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test Case 2: Indices of the two numbers that add up to " + target2 + ": [" + result2[0] + ", " + result2[1] + "]");
    }

}


  
