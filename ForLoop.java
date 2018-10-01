public class ForLoop{
   public static void main(String[]args){
   
    double amount = 10000.00;
    for (int i = 2; i < 9; i++){
      System.out.println("1000 at rate " + i +" % " + " is " + String.format("%.2f",amount*(i/100.00)));
    
    
    
    }
    System.out.println();
    for (int i = 8; i > 1; i--){
      System.out.println("1000 at rate " + i +" % " + " is " + String.format("%.2f",amount*(i/100.00)));
    
    
    
    }
   }
    

    
   
   
   
      
   
   
   
   


}