package numbers;

import java.util.Arrays;

public class Binary_Search_ofElementInArray_V21 {
    /*
      the purpose of binary search is to find the existence of element in an array (not to access/print it)
      binary search is faster than linear search, because it divides array into 2 and search only in half array.
      in this method of searching value; Array MUST BE in sorted order.
       */
    public static void main(String[] args) {


        //search for element using  binary search method
        int[] a = {2, 1, 5, 3, 4, 6, 8, 7, 9, 10};
        Arrays.sort(a);                            //array MUST BE sorted
        System.out.println(Arrays.toString(a));

        // method 1 : Arrays.binarySearch(Array Name,enter key value(6))
        System.out.println(Arrays.binarySearch(a,6));  //prints its index(5)

        //method 2 :
        int keyValue = 10;

        int low = 0;
        int high = a.length-1;

        boolean flag = false;

        while(low <= high){
            int medium = (low+high)/2;
            if (a[medium] == keyValue){
                System.out.println("element found==");
                flag = true;
                break;
            }
            if(a[medium]<keyValue){
                low = medium+1;
            }
            if(a[medium]>keyValue){
                high = medium-1;
            }
        }
        if (flag == false){
            System.out.println("element Not found ");
        }
    }
}
///////note: SortingAlgorithms/////////
/*
insertionSort  -   bubbleSort  -   mergeSort  -
quickSort      -   heapSort    -   bucketSort  -
shellSort
 */

