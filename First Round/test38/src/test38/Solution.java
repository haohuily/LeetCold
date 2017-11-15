package test38;

public class Solution {
    public static String countAndSay(int n) {
    	StringBuilder prev;
    	StringBuilder curr = new StringBuilder("1");
    	int count = 1;
    	char say;
    	
    	if(n == 1)	return "1";
    	for(int i=2; i<=n; i++){
    		prev = curr;
    		curr = new StringBuilder();
    		count = 1;
    		say = prev.charAt(0);
    		
    		for(int j=1; j<prev.length(); j++){
    			if(prev.charAt(j) != say){
    				curr = curr.append(count).append(say);
    				count = 1;
    				say = prev.charAt(j);
    				
    			}
    			else 
    				count++;
    		}
    		curr = curr.append(count).append(say);
    	}  	
    	return curr.toString();
    }
    
    public static void main(String[] args){
    	System.out.println(countAndSay(6));
    }
}

//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221 
//6.     312211
//7.     13112221
//8.     1113213211
//9.     31131211131221
//10.    13211311123113112211