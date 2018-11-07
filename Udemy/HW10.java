import java.util.Arrays;
import java.util.Scanner;
public class HW10{
   public static void main (String[]args){
      
      System.out.println(CompareSpeed());     
         
      
   }   
   
   public static boolean CompareSpeed(){
      Scanner input = new Scanner (System.in); 
      int [] speeds = new int [2];
      int sub = 0;
      for (int i = 0; i < speeds.length;i++){
         System.out.println("Enter two speeds: ");     
         speeds[i] = input.nextInt();
         sub = Math.abs(speeds[i]- sub);
                  
         
      }
      if (sub < 10){
         return false;

         
      }return true;   
   
   
   }
   
}