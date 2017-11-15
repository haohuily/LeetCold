package test67;


// 小范围可以使用下面方法     当a b非常大则不行
//public class Solution {
//    public static String addBinary(String a, String b) {
//        int c = Integer.parseInt(a,2);  
//        int d = Integer.parseInt(b,2);
//        return Integer.toBinaryString(c+d);
//    }
//    
//    public static void main(String[] args){
//    	System.out.println(addBinary("11","1"));
//    } 
//    
//}


public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder reversedresult = new StringBuilder();
        int i = a.length()-1; 
        int j = b.length()-1;
        int carry = 0, sum;
        while( i>=0 || j>=0){
        	sum = carry;
        	if(i>=0)
        		sum += a.charAt(i--) - '0';   //(int)a.charAt(i)得到字符的十进制ascii值
        	if(j>=0)
        		sum += b.charAt(j--) - '0';
        	reversedresult.append(sum%2);
        	carry = sum/2;
        }
        
        if(carry != 0)
        	reversedresult.append(carry);
        return reversedresult.reverse().toString();
    }
}