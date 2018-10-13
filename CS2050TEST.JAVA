public class CS2050TEST{
	public static void main(String[] args){
		int [] arr = {1,2,3,3,4,5,6};
		int bob = a[0];
		int jill = a[0];
		for(int i = 0; i < arr.length()-1; i++ ){
			if(a[i]>bob){
				bob = a[i];
			}else if(a[i]<jill){
				jill = a[i];
			}
			int avg = (bob + jill)/2;
			System.out.print(avg);
		}
	}
}