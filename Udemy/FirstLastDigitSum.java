/* write a method name sumFirstAndLastDigit with one parameter of type int called number
the method needs to find the first and lasy digit of the parameter number passed to the method, usoing a loop and return the sum of the first and lasty digit of that number.
is the number is negative the method needs retuen -1 to indicate an invalid value
example input/output
252 return 4 because 2 + 2
257 RETURN 9
O RETURN 0	
-10 return -1

*/
public class FirstLastDigitSum{
	public static void main (String[] args){
		int result = sumFirstAndLastDigit(157);
		System.out.println("The sum of first and last digit is : " + result);
	}
	private static int sumFirstAndLastDigit(int number){
		int sum = 0;
		if(number < 0){
			return -1;
		}
		int lastDigit = number % 10;
		sum += lastDigit;		
		while(number > 0){
			if((number/10)== 0){
				int firstDigit = number % 10;
				sum+= firstDigit;				
			}
			number/= 10;			
		}return sum;
	}
}