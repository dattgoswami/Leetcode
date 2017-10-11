package easy;

public class MissingNumber_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,3};
		System.out.println(missingNumber(nums));
	}
	//add all the even numbers and subtract all odd ones
	//separate addition of both the numbers 
	public static int missingNumber(int[] nums) {
        int length = nums.length;
        //as 0 needs to be removed
        int sum = 0;
        int i=0;
        for(i=0; i<length; i++){
        	sum += i;
        	sum -= nums[i];
        }
        sum += i;
        return sum;
    }
}
