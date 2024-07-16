package lab9_9;

import java.util.stream.Stream;

public class SquareStream {
    public static void main(String[] args) {

    printSquares(4).forEach(System.out::println);

    }

    public static Stream<Integer> printSquares(int num){
        Stream<Integer> stream = Stream.iterate(1, SquareStream::square).limit(num);
        return stream;
    }
    public static int square(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt +1)*(sqrt +1);
    }

}
