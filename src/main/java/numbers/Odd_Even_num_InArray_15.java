package numbers;

public class Odd_Even_num_InArray_15 {
    public static void main(String[] args) {

        int [] a ={3,12,55,4,7,99};

        for (int i=0;i<a.length;i++){
            if(a[i]%2 ==0){
                System.out.println(a[i] + " is even");
            }
            else {
                System.out.println(a[i] + " is odd");
            }
        }

    }
}

