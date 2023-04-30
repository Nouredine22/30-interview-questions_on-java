package strings;

public class Duplicate_Strings_inArray_v19 {
    public static void main(String[] args) {


        //find duplicate element in a String array:
        String[] friends = {"nour", "dine", "ali", "dani", "nour"};

        System.out.println("duplicate elements: ");

        boolean isDuplicate = false;
        for (int i = 0; i < friends.length; i++) {
            for (int j =i+1;j<friends.length;j++){
                if (friends[i].equals(friends[j])){
                    System.out.println(friends[i]);
                    isDuplicate = true;
                }
            }
        }
        if (!isDuplicate){
            System.out.println("duplicate element not found");
        }
    }
}
