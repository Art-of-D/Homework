package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerFilter {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("1, 2, 0", "4, 5");
        ArrayList<String> outitems = new ArrayList<>();
        for (String item : items) {
            outitems.addAll(List.of(item.split(", ")));
        }
        Stream<String> streamout = (Stream<String>) outitems
                .stream()
                .sorted();
        System.out.println(streamout.collect(Collectors.toList()));


    }

}
