public class EvenNumber{
   public static void main(String[]args){
      int number = 0;
      int end = 20;
      int sum = 0;
      int count = 5;
      while (number <= end){
         
         number++;
         if(!isEvenNumber(number)){
            System.out.println("Odd number is "+ number);
            continue;
         
         }else if(isEvenNumber(number)){
            count--;
            
            sum+=number;
            //System.out.println("The total is " + sum);

         
         
         
         }/*else if (isEvenNumber(number)){
            count++;
            System.out.println("5 even number is " + number);
         
         
         }*/
         
         System.out.println("Even number is " + number);
                  
         
      
      
      }
      System.out.println("The total is " + sum);
   
   }

   public static boolean isEvenNumber(int number){
      if(number % 2 == 0){
         return true;
   
       }else{
         return false;
   
   
      }


   }
}

