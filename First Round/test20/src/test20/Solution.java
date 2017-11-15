package test20;

import java.util.*;

public class Solution {
	public static boolean isValidString(String s){
		Stack<Character> stack = new Stack<Character>();
		for(char a : s.toCharArray()){
			if(a == '(')
				stack.push(')');
			else if(a == '{')
				stack.push('}');
			else if(a == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != a)
				return false;
				
		}
		return stack.isEmpty();  //如果全部pop完，证明true
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.print(isValidString(s));
	}
	
}
