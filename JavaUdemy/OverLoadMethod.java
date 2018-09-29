public class OverLoadMethod{
   public static void main(String[]args){
      calcFeetAndInchesToCentimeters(1,1);
      calcFeetAndInchesToCentimeters(7,5);
      calcFeetAndInchesToCentimeters(-1,0);
      calcFeetAndInchesToCentimeters(13,1);
      
      calcFeetAndInchesToCentimeters(12);
      calcFeetAndInchesToCentimeters(-12); 
      calcFeetAndInchesToCentimeters(156);     
   
   
   
   
   }
   public static double calcFeetAndInchesToCentimeters(double feet, double inches){
      if((feet < 0) || (inches < 0 && 12 < inches)){
         System.out.println("Invalid feet or inches parameter");
         return -1;
      
      
      
      }else{
         double calcCentimeter = (feet * 12 * 2.54) + (inches * 2.54);
         System.out.println(feet + " feet " + inches + " inches = " + calcCentimeter + " centimeter");
         return calcCentimeter;
      
      }
   
   
   }
    public static double calcFeetAndInchesToCentimeters(double inches){
      if (inches <0 ){
         System.out.println("Invalid inches parameter");
         return -1;
      
      
      
      
      }else{
         double calcFeet = (inches / 12);
         System.out.println(inches + " inches = " + calcFeet + " feet");
         return calcFeet;
      
      
      
      }
    
    
    
    
    
    }
      



}