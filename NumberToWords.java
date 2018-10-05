import java.lang.*;
public class NumberToWords{
	public static void nunberToWords(int number1){
		if(number1 < 0){
			System.out.println("Invalid Value");
		}
	}
	public static int reverse(int number2){		
		
		if(number2 < 0){

			int absolute = (Math.abs(number2));
			int sum = 0;
			while((absolute % 10) > 0){
				int reverse1 = absolute % 10;
								
				absolute/=10;
				sum = (sum*10 + reverse1);
			}
			sum *=(-1);
			return (sum);

		}
		int sum = 0;
		//System.out.println(number2);
		
		while ( (number2 % 10) > 0 ){
			System.out.println(number2);
			
			int reverse2 = number2 % 10;
			System.out.println(reverse2);
			//sum = sum*10 + reverse2;
			number2/=10;
		}
		//System.out.println(number2);
		return sum;
								
	}
	public static void main (String[] args){
		nunberToWords(-1);
		int reverse = reverse(100);
		//System.out.println(reverse);
	}
}