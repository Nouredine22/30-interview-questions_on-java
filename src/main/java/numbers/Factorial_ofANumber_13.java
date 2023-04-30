package numbers;

public class Factorial_ofANumber_13 {
    public static void main(String[] args) {


        // factorial of 6 : 6!=1*2*3*4*5*6 = 720

        int num = 6;
        long results = 1;
        for (int i = 1; i <= num; i++) {
            results = results * i;
        }
        System.out.println("factorial of num is: " + results);
    }
}
