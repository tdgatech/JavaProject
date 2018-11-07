public class PerfectNumber{
	public static boolean isPerfectNumber(int number){
		if(number < 1){
			return false;
		}
		int sum = 0;
		for(int i = number; i > 1; --i){
			if(number % i == 0){
				int divisor = number/i;
				sum += divisor;
				if(sum == number){
					return true;
				}
			}
		}return false;
	}	
	public static void main (String[] args){
		boolean result = isPerfectNumber(28);
		System.out.println(result);
	}
}