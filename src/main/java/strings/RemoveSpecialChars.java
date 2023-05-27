package strings;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String name ="@ Nou#re.di ne";

       String replacment =  name.replaceAll("[^a-z,A-Z,0-9, ]","");
        System.out.println(replacment);
    }
}
