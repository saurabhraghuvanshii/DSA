public class CoinChange{
    public static int coinChanges(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int [n+1][sum+1];

        //initialize - sum is 0
        //i -> coins; j -> sum/change
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }

        for(int j=1; j<sum+1; j++){
            dp[0][j] = 0;
        }
        //O(N*sum)
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){//valid
                if(coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{// invalid
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]){
        int coins[] = {1, 2, 3};
        int sum = 4; // ans = 4
        System.out.println(coinChanges(coins, sum));
    }
}