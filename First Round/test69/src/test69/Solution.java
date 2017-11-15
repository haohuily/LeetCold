package test69;

//牛顿法，求经过(x0,f(x0))的切线与x轴的横坐标。 求根的推导式： Xn+1 = (Xn + a/Xn) / 2
public class Solution {
    public static int mySqrt(int x) {
        long i = x;
        while(i*i > x){
        	i = (i + x/i)/2;
        }
        return (int)i;
    }
    
 // 二分法  
    public static int mySqrt2(int x) {
        if (x == 0)
            return 0;
        int low = 1, high = Integer.MAX_VALUE;
        while (true) {
            int mid = low + (high - low)/2;    // mid = (low+high) /2 会溢出
            if(mid == x/mid)              
            	return mid;
            if(mid > x/mid){               //mid*mid > x   会溢出
            	high = mid - 1;
            } 
            if(mid < x/mid){
            	low = mid + 1;
            	if((mid+1) > x/(mid+1))
            		return mid;
            }
        }
    }
    
    public static void main(String[] args){
    	int x = 16;
    	System.out.println(mySqrt(x));
    	System.out.println(mySqrt2(x));
    } 
}

