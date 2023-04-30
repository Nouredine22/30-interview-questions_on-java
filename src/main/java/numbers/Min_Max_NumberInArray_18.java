package numbers;

public class Min_Max_NumberInArray_18 {
    public static void main(String[] args) {
        int []a = {12,-1,34,56,100,99};

        int min = a[0];
        int max = a[1];

        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("mininum value: "+min);
        System.out.println("maximum value: "+max);
    }
}
