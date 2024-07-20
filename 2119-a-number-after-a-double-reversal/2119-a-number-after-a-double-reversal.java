class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int revNum=0;
        while(num>0){
            int dig=num%10;
            revNum=revNum*10+dig;
            num/=10;
        }
        num=revNum;
        revNum=0;
             while(num>0){
            int dig=num%10;
            revNum=revNum*10+dig;
            num/=10;
        }
        
        return revNum==original;
        
    }
}