package two_pointers;

public class ValidPalindrome {
	
	
	// Time Complexity - O(n)
	// Space complexity - O(n)
	public static boolean isPalindromeNaiveApproach(String str){ 
		
		StringBuilder reverseStrBuilder = new StringBuilder();

		for(int i=str.length()-1; i>=0; i--) {
			char selectedChar = str.charAt(i);
			reverseStrBuilder.append(selectedChar);
		}
		System.out.println("Reversed String  - "+reverseStrBuilder.toString());
		return reverseStrBuilder.toString().equals(str);
		
	}
	
		// Time Complexity - O(n). Actual running time is n/2, since constants is removed from Big(O), /2 is removed. 
		// Space complexity - O(1)
	public static boolean isPalindrome(String str){ 
		
		int beginPointer = 0;
		int endPointer = str.length() - 1;	
		
		while(endPointer > beginPointer) {
			
			char startPos = str.charAt(beginPointer);
			char endPos = str.charAt(endPointer);
			//System.out.println("startPos - "+startPos+" endPos - "+endPos);
			
			if(startPos != endPos) {
				return false;
			}
			
			beginPointer = beginPointer + 1;
			endPointer = endPointer - 1;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("isValid Palindrome - "+isPalindrome("madam"));
		System.out.println("isValid Palindrome - "+isPalindrome("madbm"));
		
		System.out.println("isValid Palindrome - "+isPalindrome("maddam"));
		System.out.println("isValid Palindrome - "+isPalindrome("madbam"));
	}
	

}
