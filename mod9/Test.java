import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> answer = new MyArrayList<>();
        answer.add("Jojo");
        answer.add("Den");
        System.out.println(answer);
        answer.remove(1);
        System.out.println(answer.size());
        System.out.println(answer.get(0));
        answer.clear();
        System.out.println(answer.size());
        answer.add("Dream");
        answer.add("Najo");
        answer.add("Najo");
        answer.add("Najo");

        System.out.println(answer.size());
        System.out.println(answer.get(3));
        System.out.println(answer.get(4));

        //MyLinkedList<Integer> secTest = new MyLinkedList<>();

    }
}