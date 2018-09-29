public class Return{
   public static void main (String[]args){
      
      /*System.out.println("The high score was " + calculateHighScorePosition(1500));
      System.out.println("The high score was " + calculateHighScorePosition(900));
      System.out.println("The high score was " + calculateHighScorePosition(400));
      System.out.println("The high score was " + calculateHighScorePosition(50));*/
      displayHighScorePosition( "Toan",calculateHighScorePosition(1500));
      displayHighScorePosition( "Nhu",calculateHighScorePosition(900));
      displayHighScorePosition( "Dung",calculateHighScorePosition(400));
      displayHighScorePosition( "Hoa",calculateHighScorePosition(50));
   
   
   }
   public static void displayHighScorePosition(String playerName,int highScorePosition){
      System.out.println(playerName + " managed to get into position");
      System.out.println(highScorePosition + " on the high score table");      
   
   
   
   
   }
   public static int calculateHighScorePosition(int PlayerScore){
      if (PlayerScore >= 1000){
         return 1;
           
      }else if (500<=PlayerScore && PlayerScore<1000){
         return 2;
      
      
      }else if (100<=PlayerScore && PlayerScore<500){
         return 3;
      
      
      }
      return 4;
   
   
   
   }




}