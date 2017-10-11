package easy;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
 * */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newStr = reverseVowels("leetcode");
		System.out.println(newStr);
	}
	
	public static String reverseVowels(String s) {
		LinkedList<Character> positions = new LinkedList();
		StringBuffer newBuffer = new StringBuffer("");
		int count=0;
		for(int i=0; i<s.length(); i++){
			char a = s.charAt(i);
			if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ){
				positions.add(a);
				count++;
			}
		}
		for(int i=0; i< s.length(); i++){
			char a = s.charAt(i);
			if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ){
				char val = positions.removeLast();
				newBuffer.append(String.valueOf(val));
			}else{
				newBuffer.append(String.valueOf(a));
			}
		}
        return newBuffer.toString();
    }

}
