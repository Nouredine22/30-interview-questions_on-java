package numbers;

import java.util.Arrays;

public class Bubble_sorting_V22 {
    public static void main(String[] args) {

        int[]a = {2,5,1,7,9,3,5};

          //bubble sorting
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("bubble sorting "+Arrays.toString(a));

        //sort() method:
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));

        //or
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
