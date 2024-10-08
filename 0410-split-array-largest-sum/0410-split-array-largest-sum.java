class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
         for(int num:nums){
             start=Math.max(start,num);
             end+=num;
        }

        while(start<end){
            int mid=(start+end)/2;

            int sum=0;
            int pieces=1;

            for(int num:nums){
                if(num+sum>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
       return end; 
    }

   
}