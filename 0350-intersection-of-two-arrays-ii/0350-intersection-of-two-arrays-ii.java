class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> list=new ArrayList<>();
     
boolean [] visited=new boolean[nums2.length];
for(int i=0;i<nums2.length;i++){
    visited[i]=false;
}
        for(int i=0;i<nums1.length;i++){
            int temp=0;
            while(temp<nums2.length){
                if(visited[temp]==false && nums1[i]==nums2[temp]){
                 list.add(nums1[i]);
                 visited[temp]=true;
                   break; 
                }
                temp++;
            }

        }
        int []arr=new int[list.size()];

        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
        return arr;
        
    }
}