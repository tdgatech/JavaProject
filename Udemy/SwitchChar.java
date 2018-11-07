public class SwitchChar{
   public static void main(String[]args){
      char variable = 'E';
      switch (variable){
         case 'A':
            System.out.println("Char was A");
            break;
         case 'B':
            System.out.println("Char was B");
            break;
         case 'C': case 'D': case 'E':
            System.out.println("Char was " +  variable);
            break;
         
         /*case 'C':
            System.out.println("Char was C");
            break;
         case 'D':
            System.out.println("Char was D");
            break;
         case 'E':
            System.out.println("Char was E");
            break;*/
         default:
            System.out.println("Char was not A,B,C,D, or E");
            break;
      
      
      }
   
   
   }


}