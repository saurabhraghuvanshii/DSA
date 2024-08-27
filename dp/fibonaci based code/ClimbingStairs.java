import java.util.*;
public class ClimbingStairs{
    // O(2^n) 
    // public static int countWays(int n){// not so good code wrost time because expintential time taken
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     return countWays(n-1) + countWays(n-2);
    // }

    //memoization code - O(n)
    public static int countWays(int n, int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){ //already calculated
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }

    //Tabulation code //O(ns)
    public static int countWaysTab(int n){
        int ways[] = new int[n+1]; // in some sitess and coder use dp insted of ways
        ways[0] = 1;
        //tabulation loop
        for(int i=1; i<=n; i++){
            if(i == 1){
                ways[i] = ways[i-1] + 0;
            }else{
            ways[i] = ways[i-1] + ways[i-2];
            }
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5; //n=3 ->3 & n =4 -> 5 => 8
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        //System.out.println(countWays(n));
        System.out.println(countWays(n, ways));
        System.out.println(countWaysTab(n));
    }
}