package easy;

public class AddStrings_415 {

	public static void main(String[] args) {
		System.out.println(addStrings("3876620623801494171","6529364523802684779"));
	}
	public static String addStrings(String num1, String num2) {
		long n1 = 0;
		long n2 = 0;
		for(int i=0; i<num1.length(); i++){
			if(i==0){
				n1 += (int)num1.charAt(i)-48;
			}else{
				n1 *= 10;
				n1 += (int)num1.charAt(i)-48;
			}
		}
		for(int j=0; j<num2.length(); j++){
			if(j==0){
				n2 += (int)num2.charAt(j)-48;
			}else{
				n2 *= 10;
				n2 += (int)num2.charAt(j)-48;
			}
		}

        long sum = n1 + n2;
        return Long.toString(sum);
    }

}
/*
 *Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
Note:
The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly. 
 */
