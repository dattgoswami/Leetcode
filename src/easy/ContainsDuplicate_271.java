package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static boolean containsDuplicate(int[] nums) {
	        Set<Integer> s = new HashSet<Integer>();
	        for(int i=0; i<nums.length; i++){
	            if(s.contains(nums[i])){
	                return true;
	            }else{
	                s.add(nums[i]);
	            }
	        }
	        return false;
	    }

}
