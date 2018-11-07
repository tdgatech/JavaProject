public class MinutesToYearsandDaysCalculator{

   public static void main(String[]args){
      printYearsAndDays(525600);
       printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);
      printYearsAndDays(0);
   
   
   
   }
   public static void printYearsAndDays(long minutes){
      if(minutes < 0){
         System.out.println("Invalid Value");
         //System.exit(0);
      
      }else if (0 <= minutes){
         long hours = minutes / 60;
         long days1 = hours / 24;
         long years = days1 / 365;
         long days2 = days1 % 365;   
      
         System.out.println("\"" + minutes + " min = " + years + " y and " + days2 +" d" + "\""); 
      }
   
   
   
   }
   
   


}