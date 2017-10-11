package easy;

public class UglyNumber_263 {

	public static void main(String[] args) {
//		int op[] = getPrimeFactors(6);
//		for(int i=0; i<op.length; i++){
//			System.out.println(op[i]);
//		}
		System.out.println(isUgly(6));
	}
	private static int[] getPrimeFactors(int i) {
		int[] op = new int[50];
		int count = 0;
		for(int j=2; j<i; j++){
			if(i%j == 0){
				if(isPrime(j)){
					op[count] = j;
					count++;
				}
			}
		}
		return op;
	}
	public static boolean isUgly(int num) {
		if(num == 1){
			return true;
		}
		int op[] = getPrimeFactors(num);
	    for(int i=0; i<op.length; i++){
	    	if((op[i]>5 || op[i]<2) && op[i]!=0){
	    		return false;
	    	}
	    }
	    return true;
	 }
	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}


/*
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
1 2 3 - 6 
1 2 - 8
1 2 7 - 14
*/