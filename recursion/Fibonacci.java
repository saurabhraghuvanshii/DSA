public class Fibonacci{

    public static int fibo(int N){
        if(N<= 1){
            return N;
        }

        int last = fibo(N-1);
        int slast = fibo(N-2);

        return last + slast;
    }

    public static void main(String args[]){
        int N = 4;
        System.out.println(fibo(N));
    }
    
}