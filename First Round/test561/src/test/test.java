package test;

import java.util.*;

public class test {
	public static int arrayPairSum(int nums[]){
		Arrays.sort(nums);
		int result = 0;
		for(int i=0; i < nums.length; i+=2){
			result += nums[i];
		}
		
		return result;
	}
	
	
	public static void main(String args[]){
		int input[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i<input.length;i++){
			input[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.print(arrayPairSum(input));
	}
}
