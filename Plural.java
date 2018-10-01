import java.util.Scanner;
import java.util.Arrays;
public class Plural{
   public static void main (String[]args){
      Scanner console = new Scanner (System.in);
      String[] a = new String [6];
      System.out.println("Please enter 6 items to array ");
      for (int i = 0; i < a.length; i++){
         a[i] = console.next();
      
      
      }
      System.out.println (Arrays.toString(a));
      for (int i = 0; i < a.length; i++){
          char temp = a[i].charAt(a[i].length() - 1);
          if (temp != 's'){
            System.out.println("false");
            System.exit(0);
          
          
          
          }
      
      
      }
      System.out.println("true");
   
   
   }


}