public class LastDigitChecker {
    private static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1<10 || 1000<num1){
            return false;
        }else if(num2<10 || 1000<num2){
            return false;
        }else if(num3<10 || 1000<num3){
            return false;
        }
        int lastDigitNum1 = num1%10;
        int lastDigitNum2 = num2%10;
        int lastDigitNum3 = num3%10;
        // if(lastDigitNum1 == lastDigitNum2==lastDigitNum3){
        //     return true;
        if(lastDigitNum1 == lastDigitNum2){
            return true;
        }else if(lastDigitNum1 == lastDigitNum3){
            return true;
        }else if (lastDigitNum2 == lastDigitNum3){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
    	boolean result = hasSameLastDigit(99,9,999);
    	System.out.println(result);

    }
    // write your code here
}