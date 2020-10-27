package mystring;

import java.util.Arrays;

public class MyString {

    public static void main(String[] args) {

        String str = "trike";
        System.out.println(str.length());
        int i = str.indexOf("i");
        System.out.println(i);

        char r = str.charAt(1);
        System.out.println(r);

        String str2 = "aaabbbccc";
        String str3 = str2.replace("a","v");
        String str4 = str2.toUpperCase();
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        char[] char1 = str2.toCharArray();
        System.out.println(Arrays.toString(char1));

        String[] strArryay = str2.split("b");
        System.out.println(Arrays.toString(strArryay));

    }

}
