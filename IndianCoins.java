import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int amt = 590;
        for(int i = 0;i<coins.length;i++){
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    count++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("Total coins required = " + count);

        for(int  i =0;i<ans.size();i++){
            System.out.println("Coin which is used = " + ans.get(i) +" ");
        }
        System.out.println();
    }

}