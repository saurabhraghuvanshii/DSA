public class Practice{
    
    static void Palindrome(int num){
        int rev = 0;
        int temp = num;
        while(num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("num is Palindrome");
        }else{
            System.out.println("not palindrome");
        }


    }

    public static int Commonfactorsdivisor(int a, int b){
       while(a > 0 && b> 0){
          if(a>b){
            a = a - b;
          }else{
            b = b - a;
          }
        }

        if(a == 0){
            return b;
        }

        return a;
    }

    public static boolean Amrstrong(int n1){
        int sum = 0;
        int temp = n1;
        while(n1 > 0){
            int rem = n1 % 10;
            sum = sum + (rem * rem * rem);
            n1 = n1/10;
        }
        if(temp == sum){
            return true;
        }else{
            return false;
        }
    }

    public static void Alldivisor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i);
            }
        }
    }

    static void fun(int i , int n){
        if( i > n){
            return ;
            
        }else{
            fun(i+1, n);
            System.out.println(i);
        }

      //  fun(i+1, n);
    }

    public static void sum(int i, int n){
        if (i<1) {
            System.out.println(n);
            return;
        }

        sum(i-1, n+i);
        
    }

    public static int factorial( int n){
        if(n ==0){
            return 1;
        }

        return n*factorial( n-1);
    }

    
    static int f(int number , int a[]){
        int cnt = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i] == number){
                cnt = cnt+1;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        // int num = 121;
        // Palindrome(num);
        // int a = 20 , b = 15;
        // int c = Commonfactorsdivisor(a,b);
        // System.out.println("GCD is " + c);
        
        // int n1 = 153;
        // System.out.println(Amrstrong(n1));

        // int n = 36;
        // Alldivisor(n);

       // int n = 4;
        //fun(1, n);
        //sum(n, 0);

        //int n = 5;
        //System.out.println(factorial(n));

        int number = 3;
        int a[] = {1,2,3,4,3,5,};
        System.out.println(f(number, a));
    }
}