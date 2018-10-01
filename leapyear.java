public class leapyear{
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
   
   
   
      
}      
      
   
   