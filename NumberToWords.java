import java.lang.*;
import java.util.Arrays;
public class NumberToWords{
	public static void numberToWords(int number1){
		if(number1 < 0){
			System.out.println("Invalid Value");
		}
		String[] words = {"","one","two","three","four","five","six","seven","eight","nine"};
		while(number1 > 0){
			int transfer = number1 % 10;
			if(transfer == 0){
				System.out.println("zero");
			}else{
				System.out.println(words[transfer]);
			}
			number1/=10;


		}

	}
	public static int reverse(int number2){
		//String[] words = {"","one","two","three","four","five","six","seven","eight","nine"};			
		if(number2 < 0){			
			int absolute = Math.abs(number2);
			int sum = 0;						
			while(absolute > 0){
				int reverse1 = absolute % 10;
				// if(reverse1==0){
				// 	System.out.println("zero");
				// }else{
				// 	System.out.println(words[reverse1]);
				// }				
				sum = sum*10 + reverse1 ;
				absolute/=10;			
			}
			sum *=(-1);
			return (sum);		
		}else{
			int sum = 0;
			while (number2 > 0 ){
				int reverse2 = number2 % 10;
				// if(reverse2 == 0){
				// 	System.out.println("zero");
				// }else{
				// 	System.out.println(words[reverse2]);
				// }				
				sum = sum*10 + reverse2;
				number2/=10;
			}
			return sum;
		}						
	}
	public static int getDigitCount(int number3){
		if (number3 < 0){
			return -1;
		}
		int count = 0;
		while(number3 > 0){
			count+=1;
			number3/=10;
		}
		return count;

	}

	public static void main (String[] args){
		numberToWords(1000);
		int reverse = reverse(-121);
		System.out.println(reverse);
		int getDigit = getDigitCount(5200);
		System.out.println("Number of digits are: " + getDigit);
	}
}