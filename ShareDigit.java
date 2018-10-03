public class ShareDigit{
	private static boolean hasSharedDigit(int num1, int num2){
	 	if(num1 < 10 || num1 > 99){
	 		return false;
	 	}else if (num2 < 10 || num2 > 99){
	 		return false;
	 	}
	 	int lastDigitNum1 = num1%10;
	 	int firstDigitNum1 = num1/10;
	 	while (num2 > 0){
	 		int num2Digit = num2 % 10;
	 		if (lastDigitNum1 == num2Digit){
	 			return true;
	 		}else if(firstDigitNum1 == num2Digit){
	 			return true;// can add to if to make code shorter but not a big deal lol
	 		}
	 		num2/=10;

	 	}return false;

	}	
	public static void main(String[] args){
	 	boolean result = hasSharedDigit(15,55);
	 	System.out.println(result);
	 }
}
