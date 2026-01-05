package Code;

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
        int[] arr = { 4, 5, 2, 10 };
        int[] res = nextGreater(arr);
        for (int n : res)
            System.out.print(n + " ");
    }
}
