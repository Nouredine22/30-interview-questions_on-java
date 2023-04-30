package strings;

public class Count0fCharsOccurences_inString_V26 {
    public static void main(String[] args) {

        String str = "Nourredine FED";

       int totalCount =  str.length();
        System.out.println(totalCount);  //count of chars. (includes whiteSpace)

        int totalCountAfterRemoveChar= str.replaceAll("(?i)E","").length();
        System.out.println(totalCountAfterRemoveChar); //count of chars without target char.

        int count = totalCount-totalCountAfterRemoveChar;
        System.out.println("number of occurrences of the target chars 'e' "+count);
    }
}
 /////////NOTE///////////
// how to include  upper and lower cases in count ? -> (?i) ///////