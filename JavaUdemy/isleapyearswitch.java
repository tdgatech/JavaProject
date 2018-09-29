public class leapyear2{
   public static void main(String[]args){
      System.out.println(isLeapYear(-1600));
      System.out.println(isLeapYear(1600));
      System.out.println(isLeapYear(2017));
      System.out.println(isLeapYear(2000));
      System.out.println(isLeapYear(1800));
      System.out.println(isLeapYear(1924));

   }
   public static boolean isLeapYear(int year){
      if (1 <= year && year <= 9999){
      
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
         
         }
      
      
      
      }
   return false;
   
   }
   public static boolean getDaysInMonth(int month, int year){
   
      if(month < 1 || month > 12){
         return -1;
      
      
      }else if(year < 1 || year > 9999){
         return -1;
      
      
      }else{
         switch (month){
            case 1: case 3: case 7: case 8: case 10: case 12:
               return 31;
               break; 
         
         
         }
      
      
      
      }
   
   
   }
   
   
   
      
}      
      
   
   