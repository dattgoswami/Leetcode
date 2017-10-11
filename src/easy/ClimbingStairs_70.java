package easy;

public class ClimbingStairs_70 {

	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}
	public static int climbStairs(int n) {
		if(n<3){
			return n;
		}
		return climbStairs(n-1) + climbStairs(n-2);
		//on leetcode but the above solution works as well but takes more time
//		 int n1 = 1;
//	        int n2 = 2;
//	        int n3 = 0;
//	        if(n<3){
//	            return n;
//	        }
//	        for(int i=3; i<=n; i++){
//	            n3 = n1 + n2;
//	            n1 = n2;//this line comes before the line below
//	            n2 = n3;
//	        }
//	        return n3;
	}
	
}
