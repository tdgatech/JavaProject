
public class DecimalComparator{
   public static void main(String[]args){
      
      System.out.println(areEqualByThreeDecimalPlaces(3,4));
      System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
      System.out.println(areEqualByThreeDecimalPlaces(3.0,3));
      
       
   
   
   }
   public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
      num1 = (int) (num1 * 1000);
      System.out.println(num1);
      num2 = (int) (num2 * 1000); 
      System.out.println(num2); 

      if ( num1 == num2){
         return true;
      
      
      
      }
   return false;
   
   }

}