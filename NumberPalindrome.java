
public class NumberPalindrome{
	private static boolean isPalindrome(int number){
		int reverse = 0;
		int num = number;
		while (num > 0 || num < 0){
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;	
			System.out.println(reverse);
			num/=10;
		}
		System.out.println("The reverse number is " + reverse);
		System.out.println("The update number is " + number);
		if(reverse == number ){
			return true; 
		}else{
			return false;
		}		
	}
	public static void main (String[] args){
		boolean Palindrome = isPalindrome(-121);
		System.out.println(Palindrome);
	}
}