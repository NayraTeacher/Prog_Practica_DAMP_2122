package UD3_06;

import java.util.Scanner;

public class Clumps {
	// 14554888896632588847 --> 55 8888 66 888
	// 14554
	
	
	public static int countClumps(int[] nums) {
		int numClumps = 0;
		boolean insideClump = false;
		
		for (int i = 0; i < nums.length - 1 ; i++) {
			 if (nums[i] == nums[i+1] && !insideClump) {
				 numClumps++;
				 insideClump = true;
			 }else if(nums[i] != nums[i+1]){
				 insideClump = false;
			 }
			 
			
		}				
		return numClumps;		
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++)
			nums[i] = scanner.nextInt();
		
		System.out.println("Clumps:" + countClumps(nums));
	}

}
