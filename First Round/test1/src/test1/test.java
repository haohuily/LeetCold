package test1;

import java.util.*;

public class test {
    public int[] twoSum(int[] nums, int target) {
    	int a[] = new int [2];
    	Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
    	for(int i=0; i<nums.length; i++){
    		if(hashmap.containsKey(target-nums[i])){
    			a[1] = i;
    			a[0] = hashmap.get(target-nums[i]);
    			return a;
    		}
        	hashmap.put(nums[i],i);
    	}
    	return a;
    }
}


//时间复杂度为 O(n)



