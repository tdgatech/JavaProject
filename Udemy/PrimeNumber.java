public class PrimeNumber{
   public static void main(String[]arg){
   /* for(init; condition; increment){
      statements
   }*/          
      for (int i = 2 ; i <= 100; i++){
         boolean flag = true;
         for(int j = 2; j < i; j++ ){
            if(i % j == 0){
               flag = false; 
               break;
            
            }
         
         
         }
         if(flag == true){
            System.out.print(i + ",");
         
         }      
      
      }
   }
      
      
   

}