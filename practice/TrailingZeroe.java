public class TrailingZeroe{
    public static int trailingZeroes(int n ) {
       int trailZero = 0;
       for(int i = 5 ; i<=n; i*=5){
           trailZero += n/i;
        }
        return trailZero;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(trailingZeroes(n));
    }

} 