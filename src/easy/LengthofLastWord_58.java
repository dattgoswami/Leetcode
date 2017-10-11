package easy;

public class LengthofLastWord_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}
	 public static int lengthOfLastWord(String s) {
		 
	        String[] parts = s.split(" ");
	        if(parts.length == 0){
				 return 0;
			 }
	        return parts[parts.length - 1].length();
	 }
}
