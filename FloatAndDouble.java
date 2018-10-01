import java.util.Scanner;
public class FloatAndDouble{
        public static void main(String[]args){
                int myIntvalue = 5/3;
                float myFloatvalue = 5f/3f;
                double myDoublevalue = 5d/3;
                System.out.println(myIntvalue);
                System.out.println(myFloatvalue);
                System.out.println(myDoublevalue);
                Scanner console = new Scanner (System.in);
                System.out.println("Enter a number of pound want to convert");
                double pound = console.nextDouble();
                double result = pound * 0.45359237;
                System.out.println ("The result is " + result + " Kilograms");
                double pi = 3.141592
                 
                
        }

}