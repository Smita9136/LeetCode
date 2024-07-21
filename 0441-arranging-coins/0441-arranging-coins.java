class Solution {
    public int arrangeCoins(int n) {
        int completeSteps=1;
        while((n-(completeSteps+1))>0){
           
            n=n-(completeSteps+1);
             completeSteps++;
        }
        return completeSteps;
    }
}