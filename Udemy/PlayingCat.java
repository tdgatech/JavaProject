public class PlayingCat{
   public static void main(String[]args){
      System.out.println(isCatPlaying(true,10) + " since temperature is in range 25 - 45");
      System.out.println(isCatPlaying(false,36) + " since temperature is not in range 25-35 (summer parameter is false)");
      System.out.println(isCatPlaying(false,35) + " since temperature is in range 25 - 35");
      System.out.println(isCatPlaying(true,33));
   
   
   }
   public static boolean isCatPlaying(boolean summer, int temperature){
      if(summer == false && (25 <= temperature && temperature <= 35)){
         return true;
      
      
      }else if(summer == false && (temperature < 25 && 35 < temperature)){
         return false;
      
      
      }else if(summer == true && (25 <= temperature && temperature <=45)){
         return true;
         
         
      }
      return false;
   
   }



}