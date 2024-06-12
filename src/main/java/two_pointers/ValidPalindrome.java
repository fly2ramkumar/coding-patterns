package two_pointers;

public class ValidPalindrome {
	
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
