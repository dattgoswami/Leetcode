package medium;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,0,1,2,-1,-4};
		ArrayList<ArrayList<Integer>> aL = threeSum(arr,0);
	}
	public static ArrayList<ArrayList<Integer>> threeSum(int[] nums, int sum) {
        int l, r;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        /* Sort the elements */
       Arrays.sort(nums);
 
        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < nums.length - 2; i++) 
        {
            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = nums.length - 1; // index of the last element
            while (l < r) 
            {
                if (nums[i] + nums[l] + nums[r] == sum) 
                {
                	ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                }
                else if (nums[i] + nums[l] + nums[r] < sum)
                    l++;
                 
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }
 
        // If we reach here, then no triplet was found
        return result;
    }
}