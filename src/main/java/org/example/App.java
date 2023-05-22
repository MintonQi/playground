package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 1;
        int b = 2;
        int d = 4;
        int c = 3;
        System.out.println( "Hello World!" );
        int t = (-1) / 2;
//        System.out.println(t + " " + (int)(-1.8));
//        System.out.println(Math.random());
//        Random r = new Random();
//        System.out.println(r.nextDouble());
//        System.out.println(r.nextDouble());
//        double nextDouble = new Random().nextDouble();
//        System.out.println(nextDouble);

        int[][] aa = new int[2][];
        aa[0] = new int[]{0,1,2,3};
        for(int i = 0; i < aa[0].length; i++){
            System.out.println(aa[0][i]);
        }
        aa[1] = new int[]{0};
        System.out.println(" "+aa[1][2]);

        List<int[]> merged = new ArrayList<int[]>();
        merged.add(new int[]{0, 1});
        merged.add(new int[]{2, 3});
        int[][] ans = merged.toArray(new int[4][2]);
        System.out.println(ans[3][0]);
        for(int i = 0; i < ans.length;i++){
            for(int j = 0; j < ans[0].length; j++){
                if(i != 2)
                    System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
//
//        int[][] ans1 = new int[4][2];
//        System.out.println(ans1[0][0]);
    }



}

class testMain{
    public static void main(String[] args) {
        long MOD = 1000000000 + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] jc = new long[n + 1];
        long[] f = new long[n + 1];
        f[1]  = 0; f[2] = 0;
        jc[1] = 1; jc[2] = 2; jc[3] = 6;
        for(int i = 3; i <= n; i++){
            jc[i] = jc[i-1] * i % MOD;
            long x = (i + 1) / 2;
            f[i] = (x * (x-1) % MOD * jc[i - 2]%MOD * (i - 1));
        }
        System.out.println(f[n]);

    }
}