package org.example;

import java.math.BigInteger;
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
        System.out.println( "Hello World!" );

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