package org.example;


public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 3, 2, 6, 5, 2, 5, 8, 10, 22, 5};
        insertionSort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

//    public static void insertionSort(int[] a){
//        for(int i = 1; i < a.length; i++){
//            int c = a[i];
//            for(int j = i - 1; a[j] > c; j--){
//                swap(a, i, j);
//                i--;
//            }
//        }
//    }
    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++)
            for(int j = i; a[j] < a[j - 1]; j--)
                swap(a, j - 1, j);
    }

    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
