package com.ppg.man.algorithm.dp;

public class Frog {

    /**
     * 小青蛙 跳台阶
     * 一次一阶 或者 两阶
     */

    public static int jump(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i-2];
        }

        return dp[n];

    }

    public static void main(String[] args) {

        int jump = jump(20);
        System.out.println(jump);
    }

}
