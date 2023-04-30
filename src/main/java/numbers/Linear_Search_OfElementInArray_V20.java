package numbers;

import java.util.Scanner;

public class Linear_Search_OfElementInArray_V20 {
    public static void main(String[] args) {

        System.out.println("please enter number to search");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();


        int[] a = {70, 20, 10, 70, 50, 30, 40, 60, 70, 80, 56, 87, 98, 23, 54, 67, 78, 12,
                43, 56, 38, 9, 4, 27, 7, 46, 91, 73, 59, 24, 44, 77, 58, 11};

            boolean flag = false;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < a.length; i++) {
                if (search == a[i]) {
                    System.out.println("found element " + search);
                    sum = sum + a[i];       // add up elements found
                    count++;            // number of occurrence


                    flag = true;
                }

            }
            if (!flag) {
                System.out.println("element do not exist");
            }
            System.out.println("sum of repeted fount element " + sum);
            System.out.println("number of occurrence " + count);
        }
    }
            // FIX  ITERATION USING RANDOM INT////////
                ///MASTER HOW TO USE "TO DO " OPTION ///////


