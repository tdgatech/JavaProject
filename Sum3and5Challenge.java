public class Sum3and5Challenge{
   public static void main(String[]args){
      
      int sum1 = 0;
      int count = 0;
      int sum2 = 0;
      for(int i = 1; i <= 1000; i++){
         if(i % 3 == 0 && i % 5 == 0){
            
            
            System.out.print(i + " ");
           
            sum1 += i;     
            
         
         
         }
         
         
               
      
      }
      
      System.out.println("\nSum all numbers are : "+sum1);
   
      for (int j = 1; j <= 1000; j++){
         if (j % 3 == 0 && j % 5 ==0){
            count++;
            sum2 += j;
            System.out.print(j + " ");
            
            
         }
         if(count == 5){
            //System.out.print(j + "");
            break;
            //System.out.print(j + "");
         
         }
         
         
              
      
      }
      System.out.println( "\nSum of 5 numbers "+ sum2);
      
   }







}