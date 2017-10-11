package hard;
/*
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].

Note: 
You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.

Follow up:
Could you solve it in linear time?
 */
public class SlidingWindowMaximum_239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,-1};
		System.out.println(maxSlidingWindow(nums,1));
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int j, max;
        int max_a[] = new int[nums.length];
        if(nums.length == 1){
            return nums;
        }
        for(int i=0; i<nums.length; i++){
            max = nums[i];
            
            for(j=1; j<k; j++){
     
                if(nums[i+j] > max){
                    max = nums[i+j];
                }
            }
           max_a[i] = max; 
        }
        return max_a;
    }
}
