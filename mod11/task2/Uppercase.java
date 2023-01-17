package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");

        Stream<String> oddF = names
                .stream()
                .map(name -> name.toUpperCase())
                .sorted();

        List<String> filteredNames = oddF.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
