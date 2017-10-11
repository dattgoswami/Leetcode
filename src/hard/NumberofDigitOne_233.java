package hard;

public class NumberofDigitOne_233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigitOne(824883294));
	}

	public static int countDigitOne(int n) {
        int count = 0;
        int total = 0;
        while(count<=n){
            total = total + checkOne(count);
            count++;
        }
        return total;
    }

    public static int checkOne(int n){
    	int count = 0;
        while(n>0){
        	int temp = n%10;
        	n = n/10;
	        if(temp == 1){
	        	count++;
	        }
        }
        return count;
    }
}

/*

 * public class Solution {

    public int countDigitOne(int n) {

        int count = 0;

        int total = 0;

        while(count<=n){

            total = total + checkOne(count);

            count++;

        }

        return total;

    }

    public static int checkOne(int n){

    int count = 0;

        while(n>0){

        int temp = n%10;

        n = n/10;

        if(temp == 1){

        count++;

        }

        }

        return count;

    }

}

 */