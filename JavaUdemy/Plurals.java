import java.util.Scanner;
import java.util.Arrays;
public class Plurals{
   public static void main(String[]args){
      Scanner console = new Scanner (System.in);
      String[] a = new String[4];
      System.out.println("Enter up to 4 words");
      for (int i = 0; i < a.length; i++){
         a[i] = console.next();
      
      
      }
      for (int i = 0; i < a.length; i++){
         char temp = a[i].charAt(a[i].length()-1);
         if (temp != 's'){
            System.out.println("false");
            System.exit(0);
         
         }
      }
      System.out.println("true");
   }



}