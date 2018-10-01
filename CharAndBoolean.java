public class CharAndBoolean{
   public static void main (String[]args){
      char mycharregister = '\u00A9';
      System.out.println("Register sysmbol = " + mycharregister);
      double myvalue1 = 20;
      double myvalue2 = 80;
      double sum = (myvalue1 + myvalue2) * 25;
      System.out.println(sum);
      double remander = sum % 3;
      System.out.println(remander);
      if (remander <= 20){
         System.out.println("Total was over the limit");
      
      
      }
      
   
   }

}