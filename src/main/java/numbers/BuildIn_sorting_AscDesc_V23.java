package numbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BuildIn_sorting_AscDesc_V23 {
    public static void main(String[] args) {

        int[] primitiveData = {3,4,1,6,4,12,51,16,30};

        //asc-> parallelsort() buildIn-method:
        Arrays.parallelSort(primitiveData);
        System.out.println(Arrays.toString(primitiveData));

        //OR asc-> .sort() buildIn-method;
        Arrays.sort(primitiveData);
        System.out.println(Arrays.toString(primitiveData));


        //// desc-> Collections.reverseOrder()  buildIn method
        Integer[] no_primitiveData = {3,4,1,6,4,12,51,16,30}; //DO NOT take primitive data

        Arrays.sort(no_primitiveData, Collections.reverseOrder());
        System.out.println(Arrays.toString(no_primitiveData)+ " reverseOrder");
    }
}
