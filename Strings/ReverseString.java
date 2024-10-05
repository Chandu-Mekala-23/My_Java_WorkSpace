package Strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = new String("THIS Is Chandu From Hyderabad");

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println(sb);
    }

}
