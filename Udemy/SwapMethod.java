import java.util.Scanner;
import java.util.Arrays;
public class SwapMethod{
   public static void main(String[]args){
      Scanner console = new Scanner (System.in);
      String[] arrays = new String[7];
      System.out.println("Enter upto 7 words to array :");
      for (int i = 0; i < arrays.length; i++){
         arrays[i] = console.next();
      
      
      }
      System.out.println(Arrays.toString(arrays));
      for (int i = 0; i < arrays.length-1; i+=2){
         String temp = arrays[i];
         arrays[i] = arrays[i+1];
         arrays[i+1] = temp;
      
      
      }
      System.out.println(Arrays.toString(arrays));
      for (int i = arrays.length; i >=0; i--){
         
      }
      System.out.println(arrays[i]);
      
   }
}