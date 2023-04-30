package strings;

import java.util.Scanner;

public class CountOfWords_inString_V27 {
    public static void main(String[] args) {

        //to count number of words in a string; count white spaces:

        //String str= "Nouredine the best student in class.";
        System.out.println("please enter your sentence:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 1 ; //we start from 1, to make the last word in string counted.
        for (int i=0;i<str.length()-1;i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.println("number of words is: "+count);
    }
}



