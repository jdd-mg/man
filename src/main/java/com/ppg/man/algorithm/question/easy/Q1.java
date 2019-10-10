package com.ppg.man.algorithm.question.easy;

public class Q1 {


    /**
     * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
     * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
     */

    public static void main(String[] args) {

    }


    public static int guess(int[] guess, int[] answer) {
        int ret = 0;
        for (int i = 0; i < 3; i++) {
            int guess1 = guess[i];
            int answer1 = answer[i];
            if (guess1 == answer1) {
                ++ret;
            }
        }

        return ret;
    }
}
