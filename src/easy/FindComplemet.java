package easy;

import java.util.Arrays;

/*
 * 476
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/

public class FindComplemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = findComplement(2);
		System.out.println(op);
	}
	
	public static int findComplement(int num) {
		String binary = Integer.toBinaryString(num);
		StringBuilder sb = new StringBuilder();
		int len = binary.length();
		for(int i=0; i<len; i++){
			if(binary.charAt(i) == '0'){
				sb.append('1');
			}else{
				sb.append('0');
			}
		}
		return Integer.parseInt(sb.toString(), 2);
/*        int binary[] = new int[32];
        int i=0;
        while(num > 0){
            binary[i] = num % 2;
            num = num / 2; // this was a mistake for binary you should have been dividing it by 2, not with 10
            i++;
        }
        System.out.println(Arrays.toString(binary));
        int flipped_binary[] = new int[32];
        int copy_i = i;
        System.out.println(i);
        while(i>0){//previously you were going till i>0 only you should go till the end =0 was missing because of which you had to do i-1 and everything
            if(binary[i-1] == 0){
                flipped_binary[i-1] = 1;
            }else{
                flipped_binary[i-1] = 0;
            }
            i--;
        }
        System.out.println(Arrays.toString(flipped_binary));
        //convert this to decimal
        System.out.println("here");
        int num_op = 0;
        int k = 0;
        for(int j=copy_i ; j>0 ; j--){//here you were using i instead of copy_i as i is already overwritten
            
            num_op = num_op + flipped_binary[j-1] * (int)Math.pow(2,k);
           
            System.out.println((j-1)+" "+num_op+" "+k);
           
            k++;
        }
        System.out.println("end");
        System.out.println(num_op);
        return num_op;*/
    }

}
