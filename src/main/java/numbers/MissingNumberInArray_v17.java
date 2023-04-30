package numbers;

public class MissingNumberInArray_v17 {
    public static void main(String[] args) {
        int []a ={6,2,3,5};  //2+3+5+6 = 16
                             // 4 missing
        int sum1 =0 ;
        int sum2 = 0;

        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];      //a[i] -> because its an array
        }
        System.out.println("sum of actual array is "+sum1);

        for(int j=2;j<=6;j++){   //simple calculation from smallest num to biggest num
            sum2=sum2+j;         // j -> no array here
        }
        System.out.println("sum (least -> biggest digit): "+sum2);

        int missingNum = sum2-sum1;
        System.out.println("missing number: "+missingNum);
    }
}
