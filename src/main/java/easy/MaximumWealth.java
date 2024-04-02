package easy;

public class MaximumWealth {

    public static int maximumWealth(int[][] accounts) {

        int highestWealth = Integer.MIN_VALUE;
        int m = accounts.length;
        int i = 0;
        int n = accounts[i].length;

        for (i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
                if (sum > highestWealth) {
                    highestWealth = sum;
                }
            }
        }
        return highestWealth;
    }

    // More efficient version

//    public static int maximumWealth(int[][] accounts) {
//        int highestWealth = 0;
//
//        for (int i = 0; i < accounts.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < accounts[i].length; j++) {
//                sum += accounts[i][j];
//            }
//            highestWealth = Math.max(highestWealth, sum); // Update highestWealth if necessary
//        }
//
//        return highestWealth;
//    }


    public static void main(String[] args) {

//        int[][] accounts = {
//                {1, 5},
//                {7, 3},
//                {3, 5}
//        };

        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        int result = maximumWealth(accounts);
        System.out.println(result);
    }
}
