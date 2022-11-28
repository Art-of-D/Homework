package Module8v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter shape: ");
        String answer = in.next();
        System.out.println(new Shape().name(answer));
    }
}
