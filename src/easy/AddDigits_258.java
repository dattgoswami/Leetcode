package easy;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

public class AddDigits_258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(38));
	}
	
	public static int addDigits(int num) {
		int sum = 0;
		while(num>0){
			sum += num%10;
//			System.out.println("1 "+sum);
			num = num/10;
//			System.out.println("2 "+num);
		}
		if(sum>10){
			sum = addDigits(sum);
//			System.out.println("3 "+num);
		}
		return sum;   
    }

}
