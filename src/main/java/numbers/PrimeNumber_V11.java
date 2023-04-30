package numbers;

import org.testng.annotations.Test;

public class PrimeNumber_V11 {
    //prime number: is divisible only by 1 and itself(2 factors) (ex: 2,3,5,7,11,13,...)

    public static void main(String[] args) {

        /*
        logic:
        1-check if given number > 1 . if yes -> check if it divides on 2 numbers. if yes-> is prime
                                      if not -> not prime
         */
        int n = -1;
        int count = 0;

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n+" prime number(n>1,n has 2 factors");
            } else {
                System.out.println(n + " NOT prime number (MORE THEN 2 FACTORS");
            }

        } else {
            System.out.println(n + " not prime number(LESS THEN 1");
        }
    }
}


