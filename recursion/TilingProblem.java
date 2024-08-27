public class TilingProblem{

    public static int tilingPrblm(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingPrblm( n-1);
        //horizontal choice
        int fnm2 = tilingPrblm(n-2);  

        int totalways = fnm1 + fnm2;
        return totalways ;
    }  
    public static void main(String[] args) {
        System.out.println(tilingPrblm(3));
        
    }
}