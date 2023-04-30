package numbers;

public class SwapTwoNumbers_V1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //third variable
        int temp = a;
               a = b;
               b = temp;
        System.out.print("a = "+a +", "+"b = "+b );

    }
}
