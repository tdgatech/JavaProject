public class Factors{
	public static void printFactors(int number){
		if(number < 1){
			System.out.println("invalid Value");
		}
		int count = number = 6;
		while (1 <= count){
			if(number % count == 0){
				int factor = number/count;
				System.out.println(factor);
			}
			count--;
		}
	}
	public static void main (String[] args){
		printFactors(6);
	}
}