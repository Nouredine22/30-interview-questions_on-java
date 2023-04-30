package numbers;

public class CountSumOfDigits_InANumber_V8 {
    public static void main(String[] args) {

        //count sum of digit in a number using
        ///////////for loop//////////
        int num = 23415;

        int sum = 0;
        String strNum = Integer.toString(num);

        for (int i= 0; i<strNum.length();i++){

            sum = sum + Character.getNumericValue(strNum.charAt(i));
        }
        System.out.println("sum of digits is: "+sum);


        ///////// while loop /////////
        int number = 5512;

        int sum2 = 0;
        while(number>0){
            sum2=sum2+number%10;   //add last digit(number%10) to sum
            number= number/10;     //then remove last digit (number/10)
        }
        System.out.println("sum of the number is "+sum2);
    }
}
