package easy;

public class SearchInsertPosition_35 {
	public static void main(String[] args) {
		int[] num = {1,3,5,6};
		System.out.println(searchInsert(num,2));
	}
	public static int searchInsert(int[] nums, int target) {
		int length = nums.length;
		for(int i=0; i<length; i++){
			if(target == nums[i]){
				return i;
			}else if(target < nums[i]){
				return i;
			}
		}
		return length;
	}
}


//first try finding the number in the array

/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/