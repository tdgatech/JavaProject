import java.util.Scanner;
public class Character{

   public static void main(String[]args){
   
   System.out.println("Enter a word: ");
   Scanner console = new Scanner (System.in);
   String words = console.next();
   words.toUpperCase();
   System.out.print(words);
   char firstletter = words.charAt(0);
   System.out.println("First letter is: " + firstletter); 
   
   
   
   }

}