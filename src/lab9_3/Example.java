package lab9_3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.iterate(1, n->n+2).limit(20);
        System.out.println(stream.collect(Collectors.toList()));

        Stream<Integer> stream1 = Stream.iterate(9, n->n+2).limit(20);
        System.out.println(stream1.collect(Collectors.toList()));
    }
}
