
public class EvenDigitSum{
	public static int getEvenDigitSum(int number){
		if(number < 0){
			return -1;
		}
		int sum = 0;
		while(number > 0){
			int getEvenDigit = number % 10;
			if(getEvenDigit % 2 == 0){
				sum+= getEvenDigit;
			}
			number/=10;
		}return sum;

	}
	public static void main(String[] args){
		int result = getEvenDigitSum(20);
		System.out.println("The sum of even digits in is " + result);

	}
}