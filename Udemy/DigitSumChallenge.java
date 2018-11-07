// write a method eoth the name sumDigits that had one int parameter call number
// if parameter is >= 10 then the method should process the number anf return sum of all digitd, otherwise return -1 to indicate an invaliud value
// the nunber from 0-9 hava 1 digit so we donoit want to process them, also we don not want to process neagative, so also return -1 for negative numbers
// for example calling the method sumDigit(125) should return 8 since 1 + 2 + 5
//calling the method sumDigit(1) shoukld return -1 as per requirement decribed above
// add somr code to the main method to test oiut the sumDigitd method to determine that is working correctly for valid and invalid values opassed as arguments
// hint: 
//		use n % 10 to exact the least-significant digit
// 		use n = n/10 to discard the least-significant digit
//		the methos need to be static like other methods so far in tyhis course

public class DigitSumChallenge{
	private static int sumDigits(int number){
		if (number < 10){
			return -1;
		}
		// 125/10 = 12 mod 5
		//	12/10 = 1 mod 2
		// 1/10 = 0 mod 1 
		// sumDigit = 5 + 2 + 1
		// stop when number = 0		
		int sumDigit = 0;
		while (number > 0){
			sumDigit += (number % 10);
			number /= 10;
		}
		return sumDigit;
	}
	public static void main (String[] args){
		int result = sumDigits(125);
		System.out.println("The sum digit of 125 is " + result);
	}

}