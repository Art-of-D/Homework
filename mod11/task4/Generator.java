package task4;

import java.util.Scanner;

public class Generator {
    public long a;
    public int c;
    public double m;
    private long n;

    public Generator(int n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 'a' number!");
        this.a = in.nextLong();
        System.out.println("Please enter 'c' number!");
        this.c = in.nextInt();
        System.out.println("Please enter 'm' number!");
        this.m = in.nextDouble();
        if (a == 0 || c == 0 || m == 0) {
            this.a = 25214903917L;
            this.c = 11;
            this.m = Math.pow(2, 48);
        }
        this.n = core(n);
    }

    public long getN() {
        return n;
    }

    public long core(int n){
        return (long) ((1 * (a * n + c)) % m);
    }
}
