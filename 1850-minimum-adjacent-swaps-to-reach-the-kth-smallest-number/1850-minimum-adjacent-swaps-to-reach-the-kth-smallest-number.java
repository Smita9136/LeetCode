class Solution {
    public int getMinSwaps(String num, int k) {
        int[] A=new int[num.length()];
   for (int i = 0; i < A.length; ++i)
      A[i] = num.charAt(i) - '0';   
        int count=0;
         int[] B=A.clone();
        for(int i=0;i<k;i++){
            nextPermutation(B);
        }
        count=countSteps(A,B);
        return count;
    }
    
     public void nextPermutation(int[] nums) {
        
        int index=-1;
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
             reverse(nums,0,nums.length-1);
            
        }
        else{
        
        for(int i=nums.length-1;i>index;i--){
            if(nums[index]<nums[i]){
                 int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
                break;
                
            }
        }
        
         reverse(nums,index+1,nums.length-1);
        }
        
        
    }
    
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
    }
      private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
    
     private int countSteps(int[] A, int[] B) {
        int count = 0;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] != B[i]) {
                int j = i;
                while (A[i] != B[j])
                    j++;
                while (j > i) {
                    swap(B, j, j - 1);
                    j--;
                    count++;
                }
            }
        }

        return count;
    }
}