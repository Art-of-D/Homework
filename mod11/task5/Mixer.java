package task5;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Mixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        return Stream.concat(first, second);
    }
}


