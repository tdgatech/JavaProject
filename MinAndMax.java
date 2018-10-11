import java.util.Scanner;
public class MinAndMax{
	public static void main(String[] args){
		Scanner console = new Scanner (System.in);
		int min = 0;//min = 2147483647// int min = Ingeger.MAX_VALUE;
		int max = 0;//max = -2147483647// int max = Integer.MIN_VALUE;
		//boolean first = true;
		while(true){
			System.out.println("Enter number");
			boolean hasNextInt = console.hasNextInt();
			if(hasNextInt){
				int number = console.nextInt();
				// if(first){
				// 	first = false;
				// 	min = number;
				// 	max = number;
				// }
				if(number > max){
					max = number;
				}else if(number < min){
					min =number;
				}
			}else{
				break;

			}
			//Scanner.nextLine();//handle input
		}
		System.out.println("The maximum is " + max);
		System.out.println("The minimum is " + min);
	}
}