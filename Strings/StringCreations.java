package Strings;

public class StringCreations {

    public static void main(String[] args) {
        char[] arr = { 'C', 'H', 'A', 'N', 'D', 'U' };

        String str = new String(arr);

        // System.out.println(str);

        // using String literals
        String str1 = "HELLO BOSS";
        String str2 = "HELLO BOSS";

        // checking equals && == Operator.
        // System.out.println(str1.equals(str2));
        // System.out.println(str1 == str2);

        // // using new keyWord;

        String str3 = new String("HI");
        String str4 = new String("HI");

        // System.out.println(str3.equals(str4));
        // System.out.println(str3 == str4);

        // both
        String str5 = "Welcome";
        String str6 = new String("Welcome");

        System.out.println(str5.equals(str6));
        System.out.println(str5 == str6);
    }

}
