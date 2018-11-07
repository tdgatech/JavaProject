public class TeenNumberCheker{
   public static void main(String[]args){
      System.out.println((hasTeen(9,99,19)));
      System.out.println((hasTeen(23,15,42)));
      System.out.println((hasTeen(22,23,24)));
   
   
   
   }
   public static boolean hasTeen(int teen1, int teen2, int teen3){
      if((13 <= teen1 && teen1 <= 19)|| (13 <= teen2 && teen2 <= 19)|| (13 <= teen3 && teen3 <= 19)){
         return true;
      
      }
      return false;
   
   
   }



}