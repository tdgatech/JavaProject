public class Whileloop{
	public static void main(String[]args){
		int number = 1;
		int finish = 20;
		while (number <= 20){
			number++;
			if(!isEvenNumber(number)){
				continue;
			}else{
				System.out.println("Even number is " + number);
			}
		}
	}
	public static boolean isEvenNumber(int number){
		if(number % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
}