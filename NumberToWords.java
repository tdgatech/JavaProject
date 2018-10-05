import java.lang.*;
public class NumberToWords{
	public static void nunberToWords(int number1){
		if(number1 < 0){
			System.out.println("Invalid Value");
		}
	}
	public static int getReverse(int number2){		
		
		if(number2 < 0){
			//System.out.println(number2);//test
			int absolute = Math.abs(number2);
			System.out.println(absolute);//test
			//System.out.println(Math.abs(number2));//test
			int sum = 0;
			int firstDigit = 0;
			if(absolute % 10 == 0){
				firstDigit+= (absolute%10);

			}
			while((absolute % 10) > 0){//100/10;10/10;1/10fail
				if((absolute % 10 == 0)){
				//int firstDigit = absolute/10;
				int reverse1 = absolute % 10;//mod1=0;mod2=0;
								
				
				sum = (sum*10 + reverse1 + firstDigit);//sum1=0;sum2-=0;
				absolute/=10;
				}
			}//aabsolute / 10)bd=10;abs=1;
			sum *=(-1);
			return (sum);

		
		}else{
			int sum = 0;
			//System.out.println(number2);//test
			
			while ( (number2 / 10) >= 0 ){
				//System.out.println(number2);//test
				
				int reverse2 = number2 % 10;
				//System.out.println(reverse2);//test
				sum = sum*10 + reverse2;
				number2/=10;
				//System.out.println(sum);//test
			}
			//System.out.println(number2)
			return sum;
		}						
	}
	public static void main (String[] args){
		nunberToWords(-1);
		int reverse = getReverse(-100);
		System.out.println(reverse);
	}
}