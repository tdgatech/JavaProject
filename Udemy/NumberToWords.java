import java.lang.*;
import java.util.Arrays;
public class NumberToWords{
	public static void numberToWords(int number1){
		if(number1 < 0){
			System.out.println("Invalid Value");
		}else{
			String[] words = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
			String numberToString = Integer.toString(number1);//convert int to string
			System.out.println(numberToString);//test this is String
			for (int i = 0; i <= (numberToString.length()-1);i++){
				char num = numberToString.charAt(i);//String to char
				int numToInt = (int)(num - '0');//char to int by minus 49 is sci of 0
				//System.out.println(numToInt);//test
				if(numToInt%10 != 0){
					System.out.println(words[numToInt%10]);	
				}else if(numToInt%10 ==0){
					System.out.println("Zero");
				}		
			}		
		}		
		
	}
	public static int reverse(int number2){
		if(number2 < 0){			
			int absolute = Math.abs(number2);
			int sum = 0;						
			while(absolute > 0){
				int reverse1 = absolute % 10;							
				sum = sum*10 + reverse1 ;
				absolute/=10;			
			}
			sum *=(-1);
			return (sum);		
		}else{
			int sum = 0;
			while (number2 > 0 ){
				int reverse2 = number2 % 10;								
				sum = sum*10 + reverse2;
				number2/=10;
			}
			return sum;
		}						
	}
	public static int getDigitCount(int number3){
		
		int count = 0;
		if (number3 < 0){
			return -1;
		}else if(number3 == 0){
			count+=1;
		}else{			
			while(number3 > 0){
			count+=1;
			number3/=10;
			}			
		}return count;		
	}
	public static void main (String[] args){
		numberToWords(-3);
		int reverse = reverse(-121);
		System.out.println(reverse);
		int getDigit = getDigitCount(0);
		System.out.println("Number of digits are: " + getDigit);
	}
}