import java.util.Scanner;
public class MegaBytesConverter {
    public static void main (String[]args){
      Scanner console = new Scanner (System.in);
      System.out.println("Enter a kiloBytes to convert");
      int kiloBytes = console.nextInt();
      printMegaBytesAndKiloBytes(kiloBytes);
      /*int quotion = kiloBytes / 1024;
      int remainder = kiloBytes % 1024;
      System.out.println(kiloBytes + " KB = "+ quotion + " MB and " + remainder + " KB");*/
            
       
        //printMegaBytesAndKiloBytes(2050);
        
        //printMegaBytesAndKiloBytes(1024);
        //printMegaBytesAndKiloBytes(-1);
        //printMegaBytesAndKiloBytes(0);
        
        
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            
            
            
        }else if (kiloBytes == 0){
            System.out.println("0 KB = "+ 0 + " MB and " + 0 + " KB");
            
         
        
        }else if (kiloBytes == kiloBytes){ 
            int quotion = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+ quotion + " MB and " + remainder + " KB");
         }

        
        
        
        
        
        
    }
  
}