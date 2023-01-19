package task4;

import task4.Generator;

import java.util.Scanner;
import java.util.stream.Stream;

public class TestGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter begin number!");
        int seed = in.nextInt();
        Stream.iterate(seed, n -> n+1)
                .limit(1) // you can comment this and get unlimited stream
                .forEach(x -> System.out.println(new Generator(x).getN()));
    }
}
