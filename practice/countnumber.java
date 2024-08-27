public class countnumber{
    public static int countNum(int num){
        //int count = 0;
        
        // while(num != 0){
        //     num = num/10;
        //     count++;

        // }
        int count  =  (int)(Math.log10(num) + 1);
        return count;
    }

    public static int reversenum(int  num){
        // int rev = 0;
        // while(num > 0){
        //     int ld = n%10;
        //     rev = (rev * 10) + ld;
        //     num = num/10;

        // }
        // return rev;
        
            
        long finalNum = 0;
        while(num!=0){
            int lastDig = num%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
                num= num/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(num<0){
            return (int)(-1*finalNum);
        }
        
        return (int)finalNum;
            
        
    }
    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(countNum(num));
        System.out.println(reversenum(num));
    }
}