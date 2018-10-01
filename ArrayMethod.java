import java.util.Scanner;
import java.util.Arrays;
public class ArrayMethod{

   public static void main(String[]args){
   Scanner console = new Scanner (System.in);
   String [] a = new String[5];
   System.out.println("Please enter up to 6 name to sort");
   for (int i = 0; i < a.length; i++){
      a[i] = console.next();
   
   
   }
   System.out.println(Arrays.toString(a));
   for (int i= 0; i < a.length-1; i+=2) {
      String temp = a[i];
      a[i] = a[i+1];
      a[i+1] = temp;
   
   
   }
   System.out.println(Arrays.toString(a));
   
   }

}