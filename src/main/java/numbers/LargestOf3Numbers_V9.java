package numbers;

import java.util.Scanner;

public class LargestOf3Numbers_V9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a");
        int a = sc.nextInt();

        System.out.println("enter b");
        int b = sc.nextInt();

        System.out.println("enter c");
        int c = sc.nextInt();

        //logic
        if(a>b && a>c){
            System.out.println(a +" is biggest then both "+b +" and "+c);
        }else if(b>a && b>c){
            System.out.println(b +" is biggest then both "+a +" and "+c);
        }else{
            System.out.println(c +" is the Biggest");
        }

    }
}
