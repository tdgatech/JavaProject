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
		System.out.println();		
		for(number = 1; number <= finish ; number++){
			if(!isEvenNumber(number)){
				continue;
			}
			System.out.println("Even number is " + number);
		}
	}
	// create a method called is Evennunber that tajkes a aparameter of type int
	// its purpose is to determinent if the argument passes to the method is
	// an even number or not
	// return true if an even number , otherwise return false

	public static boolean isEvenNumber(int number){
		if(number % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
}