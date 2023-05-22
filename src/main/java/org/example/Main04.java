package org.example;

public class Main04 {

    static char c1 = '\u0020';
    static char c2 = '\u0000';

    public static void main(String[] args) {
//        System.out.println("dd" + c1 + "sf" + c2 + "c");
//        System.out.println(c2 == c1);
//        System.out.println(""+c2 == "");
//        System.out.println(1 + 2 == 3);
        int i = 1;
        double d = 1.0;
        Integer I = 1;
        Double D = 1.0;
        System.out.println(I.doubleValue() == D);
        System.out.println(D == d);

    }
}
