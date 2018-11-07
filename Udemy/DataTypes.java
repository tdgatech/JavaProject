public class DataTypes{
        public static void main(String[]args){
                // create a byte variable and set it to any valid byte number
                // create a short and set it to any valid short number
                // create a int variable and set it to any valid int number
                // create a variable of type long , and make it equal to 5000 + 10 times to the sum of byte , plus the short plus the int
                byte bytevalue = 10;
                short shortvalue = 20;
                int intvalue = 30;
                long longtotal = 5000L + 10L*(bytevalue + shortvalue + intvalue);
                System.out.println("Longtotal " + longtotal);
        }


}
