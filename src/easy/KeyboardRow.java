package easy;

import java.awt.List;
import java.util.ArrayList;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"a", "b"};
		String[] output = findWords(input);
		 for(String s: output){
			 System.out.println(s);
		 }
	}
	  public static String[] findWords(String[] words) {
	        String row_1 = "qwertyuiop";
	        String row_2 = "asdfghjkl";
	        String row_3 = "zxcvbnm";
	        ArrayList<String> list = new ArrayList<String>();

	        for(String s: words){
	        	int[] count = {0,0,0};
	        	String temp = s.toLowerCase();
//	        	System.out.println(s);
	        	for(int i=0; i<temp.length() ; i++){
	        		if(row_1.indexOf(temp.charAt(i)) >= 0){
	        			count[0] = 1;
	        		} else if(row_2.indexOf(temp.charAt(i)) >= 0){
	        			count[1] = 1;
	        		}else if(row_3.indexOf(temp.charAt(i)) >= 0){
	        			count[2] = 1;
	        		}
	        	}
//	        	System.out.println(count[0]+" "+count[1]+" "+count[2]);
	        	if(count[0] + count[1] + count[2] == 1){
	        		if(s != null && s.length() > 0) {
	  	              list.add(s);
	  	           }
	        	}
	        }
//	        System.out.println(words.toString());

	        return list.toArray(new String[list.size()]);
//	        return op;
	        
	    }
}

/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
		
		Example 1:
			Input: ["Hello", "Alaska", "Dad", "Peace"]
			Output: ["Alaska", "Dad"]
			Note:
			You may use one character in the keyboard more than once.
			You may assume the input string will only contain letters of alphabet.*/