package Strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "level";

        StringBuffer sb = new StringBuffer(str);

        sb = sb.reverse();

        String rev = sb.toString();

        if (str.equals(rev)) {
            System.out.println("is palindrome");

        } else {
            System.out.println("not a palindrome");
        }

    }

}
