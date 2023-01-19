package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class OddFilter{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");
        String oddF = names
                .stream()
                .filter(name -> names.indexOf(name) % 2 == 0)
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.joining(", "));
        System.out.println(oddF);
    }

}
