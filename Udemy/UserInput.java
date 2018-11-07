import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine().toUpperCase();
		//Scanner.nextLine();// handle next line charcter (enter key)	
		System.out.println("Enter your age");
		boolean hasNextInt = scan.hasNextInt();//check the number valid or not
		if(hasNextInt){
			int age = scan.nextInt();
			int calAge = 2018 - age;
			System.out.println("Welcome " + name +  " You are " + calAge + " !!" );
			//scan.close();
		}else{
			System.out.println("Unable top parse year of birth");
		}

		

	}
}