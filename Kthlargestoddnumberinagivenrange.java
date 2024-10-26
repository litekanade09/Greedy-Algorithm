import java.util.*;
public class Kthlargestoddnumberinagivenrange {
    public static int OddNumberInRange(int range[],int k){
        if(k <= 0){
            return 0;
        }
        int r = range[1];
        int l = range[0];

        if((r & 1) > 0){
            int count = (int) Math.ceil(r - l + 1)/2;
            if(k > count){
                return 0;
            }else{
                return r - 2* k +2;
            }
        }else{
            int count = (r - l + 1)/2;
            if(k > count){
                return 0;
            }else{
                return r - 2* k +1;
            }
        }
    }
    public static void main(String[] args) {
        int p[]= {-3,3};
        int k = 1;
        System.out.print(OddNumberInRange(p,k));

    }
}
