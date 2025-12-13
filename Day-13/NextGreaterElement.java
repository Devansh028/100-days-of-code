/*Question 2: Next Greater Element

For each element, find the next greater element to its right.

Input: [4,5,2,25]
Output: [5,25,25,-1] */

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
