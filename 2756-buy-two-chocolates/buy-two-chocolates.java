import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Scanner sc = new Scanner(System.in);
        //int[]price = new int[100];
        //int money = sc.nextInt();
        Arrays.sort(prices);
        for(int i=0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[i]+prices[j]<=money){
                   return money - (prices[i]+prices[j]);
                        
                }
            }
        }
        return money;
    }
}