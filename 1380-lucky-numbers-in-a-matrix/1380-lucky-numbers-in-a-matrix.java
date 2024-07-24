class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();

for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
        if(returnminrow(matrix,i)==returnmaxcol(matrix,j)){
            list.add(returnminrow(matrix,i));
        }
    }
}
return list;
    }


    public int returnminrow(int[][] mat,int row){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]<min){
                min=mat[row][i];
            }
        }
        return min;
    }
       public int returnmaxcol(int[][] mat,int col){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
            }
        }
        return max;
    }
}