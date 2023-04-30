package numbers;

public class CountEvenAndOddDigits_inANumber_V7 {
    public static void main(String[] args) {


        int num = 349688;

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {             //set the condition where the loop will stop
            int lastDigit = num/10;   // find last digit to work with.
            if(lastDigit%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num= num/10;           // this operation takes off/eliminate the last digit(like a decreement)
        }
        System.out.println("count of even is: "+evenCount);
        System.out.println("count of odd is: "+oddCount);

        /// try for loop method !

       // int number = 324598;

    }
}