package numbers;

public class Duplicate_Element_inArray_19 {
    public static void main(String[] args) {


       ///// video used String ; here i use int /////

        int[] nums = {3,5,6,7,5,9,10};

        System.out.println("duplicate number: ");

        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] ==(nums[j])) {
                    System.out.println(nums[i]);
                    isDuplicate = true;
                }
            }
        }
        if (!isDuplicate) {
            System.out.println("duplicate number not found");
        }

    }
}