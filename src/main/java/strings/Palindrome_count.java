package strings;


public class Palindrome_count {
    public static void main(String[] args) {
        /* find palindromes and count them */

        String pal = "mom and dad";
        String[] words = pal.split(" ");
        int count = 0;
        for (String s : words) {
            if (isPalindrome(s)) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println("the count of palindrome is: " + count);
    }

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        return str.equals(rev);
    }
}


