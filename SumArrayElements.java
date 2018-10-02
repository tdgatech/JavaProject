import java.util.Arrays;
import java.util.Scanner;
public class SumArrayElements{
	private static void getArrayElementsSum(){
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter array size: ");
		int size = input.nextInt();
		int[] ar = new int [size];
		int sum = 0;
		for(int i = 0; i < ar.length; i++){
			System.out.println("Enter array elements");
			ar[i] = input.nextInt();
			sum = sum + ar[i];
		}System.out.println(Arrays.toString(ar));
		System.out.println("The total sum is " + sum);



	}
	public static void main(String[] args){
		getArrayElementsSum();

	}
		

}