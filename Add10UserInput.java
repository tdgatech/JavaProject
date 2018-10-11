import java.util.Scanner;
public class Add10UserInput{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= 10){
			System.out.println("Enter number # " + count);			
			boolean hasNextInt = console.hasNextInt();// check number input valid 
			if(hasNextInt){
				int number = console.nextInt();
				sum = sum + number;
			}else{
				System.out.println("Invalid input number");
				break;
			}
			count++;
		}
		System.out.printf(" \n The total sum is " + sum + "\n");
		console.close();
	}
}