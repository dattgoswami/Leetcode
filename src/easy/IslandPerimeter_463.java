package easy;

public class IslandPerimeter_463 {

	public static void main(String[] args) {
		int[][] ipgrid = {{0,1,0,0},
		                  {1,1,1,0},
		                  {0,1,0,0},
		                  {1,1,0,0}};
		System.out.println(islandPerimeter(ipgrid));		
	}
	 public static int islandPerimeter(int[][] grid) {
		 int count = 0;
		 int ncols = grid[0].length;
		 int nrows = grid.length;
		 
		 for(int i = 0; i<nrows; i++){
			 for(int j=0; j<ncols; j++){
				 if(grid[i][j] == 1){
					 //check all 4 sides of it if 0 add 1 if edges add 1 only when the sides are one not add 
					 count = count+4; 
//					 System.out.println("at +4 "+ count + " i "+i+" j "+j);
					 if((i-1)>=0){//saftety check for index value out of bound error
						 if(grid[i-1][j] == 1){
							 count--;
						 }
					 }
					 if((i+1)<nrows){//saftety check for index value out of bound error
						 if(grid[i+1][j] == 1){
							 count--;
						 }
					 }
					 if((j-1)>=0){
						 if(grid[i][j-1] == 1){
							 count--;
						 }
					 }
					 if((j+1)<ncols){
						 if(grid[i][j+1] == 1){
							 count--;
						 }
					 }
				 }
			 }
		 }
		 
		 return count;
	 }
}
/**
 *count number of 0s in touch with each 1s and count if there is any perimeter do not count the diagonal zeros =one before after below above if in any of the boundary row or column add 1 
 */

/*
 * 
 * 	 
 				if((i-1)>=0 && (i+1)<nrows){//this is different //if(i>0 || i<nrows-1){ would not solve the issue either
						 if(grid[i-1][j] == 1){
							 count--;
							 System.out.println("at -- i-1 j "+ count);
						 }
						 if(grid[i+1][j] == 1){
							 count--;
							 System.out.println("at -- i+1 j "+ count);
						 }
					 }
					 if((j-1)>=0 && (j+1)<ncols){//this is different 
						 if(grid[i][j-1] == 1){
							 count--;
							 System.out.println("at -- i j-1 "+ count);
						 }
						 if(grid[i][j+1] == 1){
							 count--;
							 System.out.println("at -- i j+1 "+ count);
						 }
					 }
					 
					 
					 ================================
					 
					 	 if((i-1)>=0 || (i+1)<nrows){//this is different //if(i>0 || i<nrows-1){ would not solve the issue either
						 if(grid[i-1][j] == 1){
							 count--;
							 System.out.println("at -- i-1 j "+ count);
						 }
						 if(grid[i+1][j] == 1){
							 count--;
							 System.out.println("at -- i+1 j "+ count);
						 }
					 }
					 if((j-1)>=0 || (j+1)<ncols){//this is different 
						 if(grid[i][j-1] == 1){
							 count--;
							 System.out.println("at -- i j-1 "+ count);
						 }
						 if(grid[i][j+1] == 1){
							 count--;
							 System.out.println("at -- i j+1 "+ count);
						 }
					 }
 * */
 
