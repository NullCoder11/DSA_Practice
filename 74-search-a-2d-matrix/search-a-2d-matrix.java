class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix==null||matrix.length==0||matrix[0].length==0){
           return false;
       }
       //storing rows & columns
       int m =  matrix.length;
       int n = matrix[0].length;

       int left = 0;
       int right = m*n-1;

       //binary search
       while(left<=right){
           int mid = left+(right-left)/2;
           int midElement = matrix[mid/n][mid%n];
           
           if(midElement == target){
               return true;
           }
           else if(midElement<target){
               left=mid+1;
           }
           else{
               right=mid-1;
           }
           
       }
       return false;
    }

}