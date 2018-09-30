// Modify the while code
// Make it also record the total number of even number it has 
// and break once 5 are found 
// and at the end , display the total number of even nunber found
public class Whileloop{
	public static void main(String[]args){
		int number = 1;
		int finish = 20;
		int count = 0;
		int totalsum = 0;
		while (number <= 20){
			number++;
			if(!isEvenNumber(number)){
				continue;
			}		
			
			System.out.println("Even number is " + number);
			totalsum += number;
			count++;
			if(count >= 5){
				break;
			}
			
		}
		System.out.println(count);
		System.out.println(totalsum);
		//System.out.println();		
		// for(number = 1; number <= finish ; number++){
		// 	if(!isEvenNumber(number)){
		// 		continue;
		// 	}
		// 	System.out.println("Even number is " + number);
		// }
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