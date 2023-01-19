package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> id1 = first.collect(Collectors.toList());
        List<T> id2 = second.collect(Collectors.toList());
        int size = Math.min(id1.size(), id2.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(id1.get(i));
            result.add(id2.get(i));
        }
        return result.stream();
    }
}


