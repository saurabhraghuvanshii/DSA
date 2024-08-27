import java . util.*;
public class Oddoreven{
    public static void evenOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            // even
            System.out.println("even number");
        } else {
                System.out.println("odd number");

        }
        

    }
    public static int getIthBit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{return 1;
        }
    }
    public static int setIthbit(int n , int i){
        int bitmask = 1<<i;
        return n| bitmask;

    }
    public static int clearIthbit(int n , int i){
        int bitmask = ~1<<i;
        return n & bitmask;
    } 
    public static int updateIthbit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthbit(n,i);

        // }
        // else {
        //     return setIthbit(n ,i);
        // }
        n = clearIthbit(n , i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }  
    public static int clearRangeBits(int n , int i, int j){
        int a = ((~0)<<(j+1));
        int b  =  (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    } 

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1)!=0){  // check lsb
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(fastExpo(3 , 5));
        // evenOdd(3);
        // evenOdd(4);
        // evenOdd(14);

    
    }
     
}

