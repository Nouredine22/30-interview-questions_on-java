package numbers;

public class CountNumberOfDigits_In_ANumber_v6 {
    public static void main(String[] args) {
        int num = 32456872;
        int count = 0;

        while(num>0){
            num= num/10;
            count++;
        }
        System.out.println("number of digits of num is: "+count);
    }
}
