package medium;

public class Search2DMatrix_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}};
		System.out.println(searchMatrix(matrix,3));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        if(matrix[0].length == 0){
            return false;
        }
        int i = 0, j = matrix[0].length;  //set indexes for top right element
        j = j-1;
       while ( i < matrix.length && j >= 0 ){
          if ( matrix[i][j] == target ){
             return true;
          }
          if ( matrix[i][j] > target ){
            j--;
           }else{ //  if mat[i][j] < x
            i++;
           }
       }
        return false;
    }

}
