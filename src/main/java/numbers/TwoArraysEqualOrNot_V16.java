package numbers;

import java.util.Arrays;

public class TwoArraysEqualOrNot_V16 {
    public static void main(String[] args) {

        int[] a1 = {2,4,7,5,9};
        int[] a2 = {2,4,7,5,9};

        ////////// Array.equals() method ////////////
        System.out.println("arrays status: "+Arrays.equals(a1,a2));  // or use boolean expression,below

        boolean status = Arrays.equals(a1,a2);
        if (status == true){
            System.out.println("arrays are equal");
        }else{
            System.out.println("arrays are NOT equal");
        }

        //////// compare length/then value of number //////////////
        boolean status2 = true;
        if(a1.length == a2.length){
            for (int i=0;i<a1.length;i++){
                if(a1[i]==a2[i]){
                    status2=true;
                }else{
                    status2=false;
                }
            }
        }else{
            status2=false;
        }


        if(status2==true){
            System.out.println("My Arrays are equal");
        }else{
            System.out.println("My Arrays are NOT equal");
        }
    }
}
