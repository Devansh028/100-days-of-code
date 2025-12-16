/* Question 1: Generate All Permutations

Given an array of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]*/

import java.util.*;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

    public static void backtrack(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, used, curr, res);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(permute(arr));
    }
}