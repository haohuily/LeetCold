package test7;

public class Solution {
    public int reverse(int x) {
        long reverse = 0;    //int reverse 后可能会溢出
        while(x!=0){
        	reverse = reverse*10 + x%10;
        	x /= 10;
        }
        if(reverse > Integer.MAX_VALUE || reverse< Integer.MIN_VALUE)
        	return 0;
        return (int)(reverse);
    }
}