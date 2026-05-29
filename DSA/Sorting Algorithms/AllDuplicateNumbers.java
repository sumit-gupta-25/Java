// Leetcode 442. Find All Duplicate Numbers in an Array

import java.util.List;
import java.util.ArrayList;

class AllDuplicateNumbers {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(nums[index]);
            }
        }

        return result;
    }
}