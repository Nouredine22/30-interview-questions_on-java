package numbers;

import java.util.Scanner;

public class Generate_Fibonacci_Serie_V10 {
    public static void main(String[] args) {
          //fibonacci series (sum of two digits equal to the next digit
        int n1 =0;  int n2=1;
        int sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter limit of your fibonacci series below ");
        int limit = sc.nextInt();

        for (int i=0;i<limit;i++){     //I want 20 numbers.
            sum=n1+n2;
            n1=n2;
            n2=sum;

            System.out.println(sum);
        }
    }
}
