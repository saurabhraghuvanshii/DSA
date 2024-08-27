public class FriendPairing{
    
    public static int frienfPair(int n){
        if(n == 1 || n == 2) {
            return n;
        }
        // //choice
        // //single
        // int fnm1 = frienfPair(n-1);

        // //pait
        // int fnm2 = frienfPair(n-2);
        // int pairways = (n-1) * fnm2;

        // //taotalWays
        // int totalWays = fnm1 + pairways;
        // return totalWays;

        return frienfPair(n-1) + (n-1) * frienfPair(n-2);
    }
    public static void main(String[] args) {
       System.out.println(frienfPair(3)); 
    }
}