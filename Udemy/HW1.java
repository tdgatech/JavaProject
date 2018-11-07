import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
public class HW1 {
	public static String process(String line) {
		line = line.replaceAll("[^0-9]", "");
		return line;
	}
	public static void countRange(int[] bins, int num) {
		int range = 101 / (bins.length);// range = 20 if every bins
		int extra = 101 % (bins.length);
		int index = num / range;
		//System.out.println("range = " + range);test
		//System.out.println("extra = " + extra);test
		//System.out.println("index = " + index);test
		if (num == 0 || num % range >= extra){//test key for 20 
			bins[index]++;
		}else {//
			bins[index - 1]++;
		}
	}
	public static void main(String[] args) throws Exception {
		//System.out.println("number of args " + args[1]);
		/*if (args.length < 2 ){
			System.out.println("How many bin would you like? ");
			Scanner sc = new Scanner (System.in);
			int numberOfBins = sc.nextInt();
			//args[1] = String.valueOf(b);
		} else {
			int numberOfBins = Integer.parseInt(args[1]);
		}*/
		//args[1] = String.valueOf(b);

		/*System.out.println("How many bin would you like? ");
		Scanner sc = new Scanner (System.in);
		int b = sc.nextInt();*/
		String name = args[0];
		Scanner scan = new Scanner(new File (name));
		int numberOfBins = 0;
		if (args.length < 2) {
			System.out.println("How many bins would you like? ");
			Scanner sc = new Scanner (System.in);
			numberOfBins = sc.nextInt();
		} else {
			numberOfBins = Integer.parseInt(args[1]);
		}		
		int[] bins = new int[numberOfBins];
		while (scan.hasNext()) {
			String line = scan.nextLine();
			//System.out.println("before process : " + line);test
			line = process(line);
			//System.out.println("after process : " + line);test
			int num = Integer.parseInt(line);
			countRange(bins, num);
		}
		int range = 101 / (bins.length);
		int begin = 100;
		int i = bins.length -1;
		//System.out.println("index i is " + i);test
		System.out.print(begin + " - " + ((begin = begin -range) + 1) + " | ");
		for (int j = 0; j < bins[i]; ++j){
			System.out.print("[]");
		}
		System.out.printf("\n");
		for ( i = (bins.length) - 2; i > 0 ; --i){
			System.out.printf(begin + " - " + ((begin = begin -range) + 1) + "  | ");
			for(int j = 0 ; j < bins[i] ; ++j){
				System.out.print("[]");
			}System.out.println();
			//System.out.println(i);test 
		}
		//System.out.println();test
		System.out.print(begin + " - " + " 0 " + " | ");
		for(int j = 0; j < bins[0]; ++j ){
			System.out.print("[]");
		}
		System.out.println();
		//System.out.println(Arrays.toString(bins));test 
		//System.out.println(bins[0]);test
	}
}