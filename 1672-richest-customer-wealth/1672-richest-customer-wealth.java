class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth=0;
        
        for(int[] account:accounts){
            int sum=0;
            for(int acc:account){
                sum=sum+acc;
            }
            if(maxWealth<sum){
                maxWealth=sum;
            }
        }

        return maxWealth;
        
    }
}