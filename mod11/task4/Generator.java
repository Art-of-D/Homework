package task4;

import java.util.Scanner;
import java.util.stream.Stream;

public class Generator {
    private static final long a = 25214903917L;
    private static final int c = 11;
    private static final double m = Math.pow(2, 48);



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int seed = in.nextInt();
        Stream.iterate(seed, n -> n+1)
                .limit(10) // you can comment this and get unlimited stream
                .forEach(x -> System.out.println(core(x)));
    }

    private static long core(int n){
        return (long) ((1 * (a * n + c)) % m);
    }




}
