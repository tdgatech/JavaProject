import java.util.Arrays;
public class GreatestCommonDivisor{
	private static int getGreatestCommonDivisor(int num1, int num2){
		if(num1 < 10 || num2 < 10){
			return -1;
		} 
		for (int i = 1; i <= num1; i++ ){			
			if(num1 % i == 0){
				int divisor1 = num1/i; 
				//System.out.print(" " + divisor1);
				for (int j = 1; j <= num2; j++){
					if(num2 % j == 0){
						int divisor2 = num2/j;
						//System.out.print(" " + divisor2);
						if(divisor1 == divisor2){
							return divisor1;
						}
					}
				}
			}		
		}		
		return -1;
	}
	public static void main (String[] args){
		int result = getGreatestCommonDivisor(25,15);
		System.out.println("the greates common divisor is " + result);
	}
}