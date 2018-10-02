/* Number Palindrome Challenge
	. write a method call isPalindrome with one int parameter called number
	. the method needs to return a boolean
	. it should return true if the number is a palindrome otherwise it should return false.
	. example input/ouput:
		isPalindrome(-1221); should return true;
		isPalindrome(707); should return true;
		isPalindrome(11212); should return false because reverse 21211 and that is not equal to 11212;
	Tip: a Palindrome number is a number which when reversed is equal to the original number. For example: 121,12321,1001 etc.
	Tip: logic to check a palindrome number
	Find the reverse of given number . store it in some variable say reverse. compare the number with reverse.
	if both are the same then the number is a palindrome otherwise is not.
	Tip: logoc to reverse a number
	Declare an initialize another variable to store the reverse of a number, for example reverse = 0.
	Extract the last digit of the given number by performing modulo division.
	store the last digti to some variable say lastdigit = num % 10.
	Increase the place value of reverse by one.
	To increase place vakue multiply reverse variable by 10 e.g. reverse = reverse *10
	Add latDigit to reverse.
	Since last digit of num is processed, remove last digit of nuim. To remove last digit divide num by 10.
	repeat steps until num is not equal to (or greater than ) zero.
*/
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