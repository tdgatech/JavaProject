public class SumOdd{
   public static void main(String[]args){
      System.out.println(isOdd(-1));
       System.out.println(isOdd(1)); 
        System.out.println(isOdd(2)); 
        //System.out.println("Sum Odd is "+ sumOdd(1,100)); 
        //int sum = sumOdd(1,100);
        System.out.println(sumOdd(1,100) );
        System.out.println(sumOdd(-1,100) );
        System.out.println(sumOdd(100,100) );
        System.out.println(sumOdd(100,1000) );
   
   
   
   }
   public static boolean isOdd(int number){
      if(number < 0){
         return false;
      
      
      }else if((number > 0) && (number % 2 != 0)){
         return true;
      
      
      }
      return false;
      
   
   
   
   }
   public static int sumOdd(int start, int end){
      if((start <= end) && (0 < start) && (0 < end) ){
         int sum = 0;
         for (int i = start; i <= end; i++){
            if(i % 2 != 0){
               sum += i;
               //return sum;
               
                           
            }
            
         }
         //System.out.print("Sum is "+ sum);
         return sum;        
      }
      if((start > end) || (start < 0) || (end < 0)){
         //System.out.println("Invalid input");
      
      
      }
      return -1;
   
   
   }

}