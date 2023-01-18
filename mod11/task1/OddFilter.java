package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class OddFilter{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");

        Stream<String> oddF = names
                .stream()
                .filter(name -> (names.indexOf(name) % 2) == 1);

        List<String> filteredNames = oddF.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
