package easy;

public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3};
		System.out.println(removeElement(nums,3));
	}
	 public static int removeElement(int[] nums, int val) {
		 int length = nums.length;
		 for(int i=0 ; i<length ; i++){
			 if(nums[i]==val){
				 for(int j=i; j<length-1; j++){
					 nums[j]=nums[j+1];
					 printNum(nums,length);
				 }
				 nums[length-1] = -999;
				 length--;
				 printNum(nums,length);	 
			 }
		 }
	        return length;
	 }
	 public static void printNum(int[] num, int length){
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
			System.out.println("len " + length);
		} 
		System.out.println("end");
	 }
}

/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
*/