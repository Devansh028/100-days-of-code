/*Question 1: House Robber (Optimized DP)

You are given houses with money.
You cannot rob two adjacent houses.
Return the maximum amount you can rob.

This is the optimized version (O(1) space).

Example:

nums = [2,7,9,3,1]
Output = 12 */

public class HouseRobberOptimized {

    public static int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 3, 1 };
        System.out.println(rob(arr));
    }
}