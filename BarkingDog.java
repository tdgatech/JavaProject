public class BarkingDog {
	
	public static void main(String[] args) {
		System.out.println(bark(true, 1));
		System.out.println(bark(false, 2));
		System.out.println(bark(true, 8));
		System.out.println(bark(true, -1));
		System.out.println(bark(true, 23));
		System.out.println(bark(true, 0));
	}
	
	public static boolean bark(boolean barking, int hourOfDay) {
		return barking && ((0 <= hourOfDay && hourOfDay < 8) || (22 < hourOfDay && hourOfDay <= 23));
	}
}
