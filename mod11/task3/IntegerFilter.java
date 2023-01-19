package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerFilter {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("1, 2, 0", "4, 5");

        String out = items
                .stream()
                .flatMap(item->Stream.of(item.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(out);
    }

}
