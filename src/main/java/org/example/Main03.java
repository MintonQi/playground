package org.example;

import java.util.*;


/**
 * Tom has many toys. He likes to pile them up in a certain order. The ratio between two adjacent piles' amounit of
 * toys is a fixed value. Which means the numbers of toys in each pile's amount constitutes an equal ratlo seqjuerice
 * For example: 16.24,36,54, Its equal ratio value is: 3/2.
 * Now, we know some piles of toy numbers. Please calculate the maximum possible equivalence based on this.
 * Notice: the amount of toys can be the same.
 * Function Description
 * Complete the function maximumEquivalence in the editor below. The function must state what must be returnedor printed.
 * functionName has the following parameter(s):
 * piles/N) indicates that the next row contains N positive integers
 * toys: positive integers Xi on the second line, separated by spaces. Each integer represents the toys amount of the pileswe know
 * For each set of test data. output a number of the format A/B , reauiring A and B to be coprime, indicates themaximum possible scaling factor
 * Constraints
 * pilesN(0<N<100)
 * toys Xi(0<Xi < 10A18)
 */
public class Main03 {

    public static List<Long> getInput(){
        List<Long> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            input.add(in.nextLong());
        }
        return input;
    }

    public static long gcd(long x, long y){
        return x == 0 ? y : gcd(y % x, x);
    }

    public static String maximumEquivalence(List<Long> toys){
        Set<Long> s = new HashSet<>(toys);
        toys = new ArrayList<>(s);
        Collections.sort(toys);
        for(int i = 1; i < toys.size(); i++){
            long t0 = toys.get(i - 1);
            long t1 = toys.get(i);
            long d = gcd(t0, t1);

        }



        int x = 0,y = 0;
        return x + "/" + y;
    }

    public static void main(String[] args) {
//        List<Long> toys = getInput();
//
//        for(int i = 0; i < toys.size(); i++){
//            System.out.println(toys.get(i));
//        }

        System.out.println(gcd(200, 3125));
        System.out.println(3125/25);

        // 32 200 3125
        // 4 25 8 125
        //   8   25
//        System.out.println(maximumEquivalence(getInput()));
    }
}
