import java.util.Scanner;
public class ReviewSumInput{
   public static void main(String[]args){
      Scanner console = new Scanner (System.in);
      int sum = 0;
      for (int i = 1; i <= 5; i++){
         System.out.print("Type a number: ");
         sum = sum + console.nextInt();
      
      
      }
      System.out.println("The sum is " + sum );
  
   
   
   }
   

}