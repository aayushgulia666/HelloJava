package com.aayush.gulia.Matrix.Questions;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        System.out.println(richestAccount(accounts));
    }

    /**
     * LeetCode 1672
     * @param accounts 2D array (matrix)
     * @return maximum wealth ith customer has.
     */

    static int richestAccount(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE, wealth = 0;

        for (int i=0; i<accounts.length; i++){
            for (int j=0; j<accounts[0].length; j++){
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) maxWealth=wealth;
            wealth=0;
        }
        return maxWealth;
    }
}
