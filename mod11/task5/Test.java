package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");
        List<String> names2 = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");
        Stream<String> first = names
                .stream()
                .filter(name -> (names.indexOf(name) % 2) == 1);

        Stream<String> second = names2
                .stream()
                .map(name -> name.toUpperCase())
                .sorted();


        List<String> stream = Mixer.zip(first, second).toList();
        System.out.println(stream);
        /*String stream = Mixer.zip(first,second)
                        .collect(Collectors.joining(","));*/

        /*String concat = Mixer.zip(first, second)

                .collect(Collectors.joining(", "));
        System.out.println(concat);
*/

    }
}
