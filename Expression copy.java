public class Expression {
   public static void main (String[]args){
      
      int score = 800;
      int levelcomplete = 5;
      int bonus = 100;
      //CalculateScore(gameover,score,levelcomplete,bonus);
      
      //int highScore = calculateScore(score,levelcomplete,bonus);
      System.out.println("Your final score was" + calculateScore(score,levelcomplete,bonus));
      
         
   }
   public static int calculateScore(int score, int levelcomplete, int bonus){
      
         int finalScore = score + (levelcomplete * bonus);
         finalScore += 2000;
         return finalScore;
         //System.out.println(finalScore);
         //return finalScore;
      
      
        
   
   
   
   
   }

}