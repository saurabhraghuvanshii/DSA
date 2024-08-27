import java.util.ArrayList;
public class Pairsum{
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     int lp = 0;
    //     int rp = list.size()-1;

    //     while(lp != rp){
    //         //case1
    //         if(list.get(lp)+list.get(rp) == target){
    //             return true;
    //         }
    //         //case2
    //         if(list.get(lp)+list.get(rp)< target){
    //             lp++;
    //         }
    //         else{
    //             //case 3
    //             rp--;
    //         }
    //     }
    //     return false;
    // }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1; // smallest
        int rp = bp; // largest

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //  case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else{
                // case 3
                rp = (n+rp-1)%n;
            }
            
        }
        return false;

    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list,target));
        
    }
}