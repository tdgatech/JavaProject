public class SecondsandMinutesChallenge1{
   public static void main(String[]args){
      System.out.println(getDurationsString(66,1));
      System.out.println(getDurationsString(5));
   
   
   
   }
   public static String getDurationsString(int minutes, int seconds){
      if (minutes < 0 || seconds < 0 || 59 < seconds){
         return "Invalid value";
      
      }
      int calhours = minutes / 60;
      int calminutes = minutes % 60;
      String calhoursString = calhours + "h " ;
      String calminutesString = calminutes + "m ";
      String secondsString = seconds + "s";
      if (calhours < 10){
         calhoursString = "0" + calhoursString;
      
      }
      if (calminutes < 10){
         calminutesString = "0" + calminutesString;
      }
      if (seconds < 10){
         secondsString = "0" + secondsString;
      
      }
      return   calhoursString   + calminutesString  + secondsString ;
      
   }
   public static String getDurationsString(int seconds){
   
      if (seconds < 0){
         return "Invalid value";
      
      }
      int calminutes = seconds / 60;
      int calseconds = seconds % 60;
      String calminutesString = calminutes + "m ";
      String calsecondsString = calseconds + "s";
      if (calminutes < 10){
         calminutesString = "0" + calminutesString;
      
      }
      if(calseconds < 10){
         calsecondsString = "0" + calsecondsString;
      
      }
      return  calminutesString   + calsecondsString ;  
   
   
   }
      
      
   
   


}