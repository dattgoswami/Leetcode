package easy;

import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "()[]{}";
		String s2 = "([)]";
		System.out.println(isValid(s1));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++){
        	if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
        		st.push(s.charAt(i));
        	}else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
        		Character stPop = st.pop();
        		Character strChar = s.charAt(i);
        		if(strChar == ')' && stPop !='(' ){
        			return false;
        		}else if(strChar == '}' && stPop !='{' ){
        			return false;
        		}else if(strChar == ']' && stPop !='[' ){
        			return false;
        		}
        	}
        }
        if(st.isEmpty()){
        	return true;
        }
        return false;
    }
}
