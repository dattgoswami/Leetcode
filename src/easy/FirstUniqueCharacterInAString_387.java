package easy;

public class FirstUniqueCharacterInAString_387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int firstUniqChar(String s) {
		 int sLength = s.length();
		 int[] count = new int[26];
		 for(int i=0 ; i<26 ; i++){
			 count[i] = 0;
		 }
		 for(int i = 0 ; i<sLength ; i++){
             int sC = (int) s.charAt(i);
             sC = sC-97;
             count[sC]++;
         }
		 for(int i = 0 ; i<sLength ; i++){
			int sC = (int) s.charAt(i);
			sC = sC - 97;//do not forget this step
            if(count[sC] == 1){
            	return i;
            }
         }
		 return -1;  
	 }

}


/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */