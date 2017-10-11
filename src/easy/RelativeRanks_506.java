package easy;

import java.util.Arrays;
import java.util.StringTokenizer;

public class RelativeRanks_506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,3,8,9,4};
		for(int i = 0; i<nums.length;i++){
			System.out.println(nums[i]);
		}
		System.out.println("==============");
		Arrays.sort(nums);
		for(int i = 0; i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	
}
