package test26;

public class Solution {
    public static int removeDuplicates(int[] nums) {
    	int totaldupcount = 0;
    	int dupcount = 0;
    	
        for(int i=0; i<nums.length-1; i++){
        	for(int j=i+1; j<nums.length; j++){
        		if(nums[i] == nums[j])
        			dupcount++;
        			i+=dupcount;
        			totaldupcount+=dupcount;
        			dupcount =0;
        	}
        }
        return nums.length-totaldupcount;      	
    }
    
    	//别人的方法，可以返回不重复的数组和长度
        public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums){
            if (i == 0 || n > nums[i-1])
            nums[i] = n;
            i++;
        }
            
        return i;
        }

    public static void main(String[] args){    	
    	int[] nums = {1,2,2,2,2,3,4,4,5};
    	System.out.println(removeDuplicates(nums));
    	System.out.println(removeDuplicates2(nums));
    }
}