package Strings;

import java.lang.*;

public class MutableUsingSB {
    public static void main(String[] args) {
        String str = "Chandu";

        System.out.println(str + "Chandu");

        StringBuilder sb = new StringBuilder(str);

        sb.append(" from Puttur");

        System.out.println(sb);
    }

}
