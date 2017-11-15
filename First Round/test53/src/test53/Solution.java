package test53;


// Dynamic Programming
public class Solution {
    public int maxSubArray(int[] nums) {
        int f = 0;   //包含nums[i]的子序列的最大和；
        int result = nums[0];
        for(int i=0; i<nums.length; i++){
        	f = Math.max(f + nums[i], nums[i]);
        	result = Math.max(result, f);       	
        }
        return result;
    }
}