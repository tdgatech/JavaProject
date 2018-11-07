import java.util.Arrays;
import java.util.Scanner;
public class HW10Version2{
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
      Scanner string = new Scanner(System.in);
      String donut;
      System.out.println(sub);
      System.out.print("Enter f for false and t for true: ");
      donut = string.next();

               
      if (sub > 10 && donut.equals("t")){
         
         return true;
         
         
      
        
      }else if((5 <= sub && sub <= 10) && donut.equals("f")){
         
         return true;
         
      
      
      }else if (sub < 5 && donut.equals("t")){
         return true;
      
      }else if (speeds[0] >= 100){
         
         return true;
      
      
      }
      return false;
      
      
      
   
   
   }
   
}