package strings;

public class ReplaceAll_WhiteSpaces {
    public static void main(String[] args) {


        String str = "I'm learning   JAVA@";
        str=str.replaceAll("\\s","");
        System.out.println(str);

        str=str.replaceAll("[^a-z,A-Z]","");
        System.out.println(str);

    }
}