package test27;

public class Solution {
    public static int removeElement(int[] nums, int val) {
    	int m = 0;   //这种题不需要新建array，新建下标即可
    	for(int n: nums){
    		if(n != val){
    			nums[m] = n;
    			m++;
    		}
    	}
    	return m;
    }
    public static void main(String[] args){
    	int a[] = {1};
    	System.out.print(removeElement(a,1));
    }
}