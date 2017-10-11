package easy;

public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(ip));
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
		    int max = 0;
	        int count = 0;
	        for(int i=0; i<nums.length ; i++){
	        	if(nums[i]==1){
	        		count++;
	        	}else{
	        		if(max < count){		
	        			max = count;
	        		}
	        		count = 0;
	        	}
	        }
	        //this last one is for the cases with one at the end in which case the else would not be executed and else is where count is becoming zero so that would not have been executed
	        return (max < count) ? count : max;
	    }
}
