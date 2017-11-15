package test9;

import java.util.*;

public class Solution {
    public static boolean isPalindrome(int x) {
    	if(x>0){
    		long reverse = 0;
    		int stored = x;
    		while(x!=0){  			
    			reverse = reverse*10 + x%10;
    			x/=10;
    			if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
    				return false;
    			else if(reverse == stored)
    				return true;
    		}
    	}
    	else if(x==0)
    		return true;
    	return false;  	
    }
    
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.print(isPalindrome(x));
		scan.close();
    }
     
}