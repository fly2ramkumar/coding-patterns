package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
	
	// Main point to consider for this problem is to avoid non duplicate triplets.
	// Need to avoid processing the duplicate numbers in the initial for loop
	// If the current sum is equal to the target sum, we need to do start++ and end--. 
			//When start++ is equal to start, then we need to increment start further till we find non duplicate number.
			//When end-- is equal to end, then we need to decrement end further till we find non duplicate number.
	
	private static List<List<Integer>> tripletSums(int[] nums) {
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		List<List<Integer>> result = new ArrayList<>();		

		for(int i=0; i< nums.length - 2; i++) {
			
			// avoid processing the duplicate numbers
			if(i > 0 && nums[i] == nums[i-1])
				continue;
			
			System.out.println(nums[i]);
		
			int start = i+1;
			int end = nums.length - 1;
			int targetSum = -nums[i];
			
			while(start < end) {	
				
				System.out.println(+nums[i]+" : "+nums[start]+" : "+nums[end]+" : "+start+" : "+end);
				
				int currentSum = nums[start] + nums[end];
				
				if(currentSum == targetSum){					
					result.add(List.of(nums[i], nums[start], nums[end]));
					
					start++;
					end--;
					
					while(start < end && nums[start] == nums[start - 1])  // increment start further till we find non duplicate number
						start++;
					
					while(end > start && nums[end] == nums[end + 1]) // decrement end further till we find non duplicate number
						end--;
					
				} else if(targetSum > currentSum) {
					start++;
					
				} else {
					end --;	
					
				}
						
			}
		
		}

		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> tripletsList = tripletSums(new int[] {-2,0,0,2,2});
		tripletsList.stream().forEach(System.out::println);
	}
}
