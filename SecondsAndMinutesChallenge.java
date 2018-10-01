public class SecondsAndMinutesChallenge{
   public static void main(String[]args){
      getDurationString(221,60);
      getDurationString(7896);
      
   
   }
   public static void getDurationString(int minutes, int seconds){
      if ((minutes < 0 )|| (seconds < 0 && 59 < seconds)){
         System.out.println("Invalid value");
         
      
      
      }else{
         int caltotalseconds = (minutes * 60 + seconds);
         //System.out.println(caltotalseconds);
         int calhours = caltotalseconds / 3600;
         //System.out.println(calhours + "hour");
         int calminutes = (caltotalseconds % 3600)/60;
         //System.out.println(calminutes + "minutes");
         int calseconds = (caltotalseconds % 3600) % 60;
         //System.out.println(calseconds + "seconds");
         System.out.println(minutes + " minutes and " + seconds + " seconds = " + calhours+ "h " + calminutes + "m " + calseconds + "s") ;
         
         
         
      }
   }
   public static void getDurationString(int seconds){
      if (seconds < 0){
         System.out.println("Invalid value");
      
      
      
      }else{
         int calminutes = seconds / 60;
         //System.out.println(calminutes + "minutes" );
         int calseconds = seconds % 60;
         //System.out.println(calseconds + "seconds");
         System.out.println(seconds + " seconds = " + calminutes + "m " + calseconds + "s");
      
      
      
      }
   
   
   
   }
   
          
            
      
      
      
      
}
      
   
   



