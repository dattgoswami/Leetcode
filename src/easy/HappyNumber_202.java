package easy;

public class HappyNumber_202 {
	public static void main(String[] args) {
		System.out.println(isHappy(1111111));
	}
	public static boolean isHappy(int n) {
		int sum = 0;
		int count = 0;
		sum = getSumDigits(n);
		//this was challenging to come up with a condition that uses sum and loops using something else
		while((sum != 1) && count < 100 ){
			sum = getSumDigits(sum);
			count++;
//			System.out.println(sum);
		}
		if(sum == 1){
			return true;
		}
        return false;
    }
	
	public static int getSumDigits(int n) {
		int sum = 0;
		//previously n > 9 in which last digit was not being separated
		while(n != 0){
			int temp = n%10;
//			System.out.println(temp);
			temp = (int) Math.pow(temp, 2);
			sum += temp;
//			System.out.println("sum "+sum);
			n /=10;
		}
		return sum;
    }

}
/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number
1 square + 9 square
12 + 92 = 82
8 square + 2 square
82 + 22 = 68
6 square + 8 square
62 + 82 = 100
1 0 0 
12 + 02 + 02 = 1
*/