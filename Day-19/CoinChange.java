/*Question 1: Coin Change (Minimum Coins)

Given an array of coin denominations and an amount, return the minimum number of coins needed to make that amount.
If it’s not possible, return -1.

Example:

coins = [1,2,5], amount = 11
Output: 3  (5 + 5 + 1) */

import java.util.*;

public class CoinChange {
    public static int CoinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        System.out.println(CoinChange(coins, 11));
    }

}