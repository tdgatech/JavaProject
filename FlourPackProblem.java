public class FlourPackProblem{
	public static boolean canPack(int bigCount,int smallCount, int goal ){
		if(bigCount < 0|| smallCount < 0|| goal < 0){
			return false;
		}else{
			for(int b = bigCount; b >= 0; b--){
				System.out.print(" " + b);
				for (int s = smallCount; s >= 0  ; s--){
					System.out.print(" " + s);
					if(b*5 + s*1 == goal){
						System.out.print(" sum is " + (b*5 + s*1));
						return true;
					}
				}
			}

		}

		return false;
		

	}
	public static void main(String[] args){
		boolean result = canPack(5,1,6);
		System.out.println(result);
		// result = canPack(1,0,4);
		// System.out.println(result);
		// result = canPack(1,0,5);
		// System.out.println(result);
		
			
		

	}
}