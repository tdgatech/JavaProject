import java.util.Scanner;
import java.io.*;
public class PrintBill{
   public static void main(String[]args){
   Scanner console = new Scanner (System.in);
   System.out.print("How many people ate? ");
   int people_ate = console.nextInt();
   int Subtotal = 0;
   
   
   for (int i = 0; i < people_ate; i++){
    
      System.out.println("How much did your dinner cost? ");
      int cost = console.nextInt();
      Subtotal = Subtotal + cost;  
   }
   System.out.println("Subtotal : " + Subtotal);
   //System.out.printf( "Tax: $%2.2f\n" + Subtotal*0.06);
   System.out.println( "Tax: " + Subtotal*0.06);
   double tax = Subtotal*0.06;
   System.out.println("Enter your tips: ");   
   double tip = console.nextDouble();
   //System.out.printf( "Tip: $%2.2f\n" + tip);
    System.out.println( "Tip: " + tip);
    System.out.println ("Total: " + (Subtotal + tax + tip));
    
   }

}