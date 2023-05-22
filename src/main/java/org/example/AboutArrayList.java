package org.example;

import java.util.*;

public class AboutArrayList {

    public static void main(String[] args) {
//        Map<Integer, Integer> m = new HashMap<>();
//        m.put(2, 4);
//        m.put(3, 7);
//        List<Integer> keyList = new ArrayList<>(m.keySet());
//        for(int i : keyList) {
//            System.out.println(i);
//        }

//        String s = "as0dvi";
//        System.out.println(s.substring(0, 1));
//        System.out.println(s);

        int[] a = new int[]{0, 1, 2, 3, 6, 7};
        int[] b = new int[]{2, 3};
        System.arraycopy(b, 0, a, 4, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Deque<Integer> dq = new ArrayDeque<Integer>();

    }

    public void t(int ta, int tb) {
        int tc = 0;
        System.out.println(ta);
    }

    public static void tt(int ta, int tb) {
        int tc = 0;
        System.out.println(ta);
    }
}
