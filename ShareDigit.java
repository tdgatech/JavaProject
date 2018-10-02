public class ShareDigit{
	private static boolean hasShareDigit(int num1, int num2){
	 	if((num1<10 || num1>99)||(num2<10 || num2>99)){
	 		return false;
	 	}else if((num1%10 == num2/10)){
	 		return true;
	 	}else if(num1/10 == num2%10){
	 		return true;
	 	}
	 	return false;

	}	
	public static void main(String[] args){
	 	boolean result = hasShareDigit(12,23);
	 	System.out.println(result);
	 }
}
