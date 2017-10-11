package easy;

public class DetectCapital_520 {

	public static void main(String[] args) {		
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("leetcode"));
		System.out.println(detectCapitalUse("Google"));
	}
	public static boolean detectCapitalUse(String word) {
		//check for all caps and return true 
		//check for all small and return true 
		//check for first capital and all others small and return true 
		//do not return false in any of these cases return only when all 3 checks are over 
		return checkAllUpper(word) | checkAllLower(word) | checkFirstUpper(word); 
    }
	private static boolean checkAllUpper(String word) {
		int i=0;
		while(i<word.length()){
			if(!Character.isUpperCase(word.charAt(i))){
				return false;
			}
			i++;
		}
		return true;
	}
	private static boolean checkAllLower(String word) {
		int i=0;
		while(i<word.length()){
			if(!Character.isLowerCase(word.charAt(i))){
				return false;
			}
			i++;
		}
		return true;
	}
	private static boolean checkFirstUpper(String word) {
		int i=0;
		if(!Character.isUpperCase(word.charAt(i))){
			return false;
		}
		i = 1;
		while(i<word.length()){
			if(!Character.isLowerCase(word.charAt(i))){
				return false;
			}
			i++;
		}
		return true;
	}
}


/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */