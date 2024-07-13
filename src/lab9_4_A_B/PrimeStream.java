package lab9_4_A_B;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Iterator;

public class PrimeStream {
    public static void main(String[] args) {
        // Create an infinite stream of prime numbers
//        final Stream<Integer> primes = StreamSupport.stream(Spliterators.spliteratorUnknownSize(new PrimeIterator(), Spliterator.ORDERED), false);

        // Print the first 10 prime numbers
//        primes.limit(10).forEach(System.out::println);

        printFirstNPrimes(10); // Print the first 10 prime numbers
        printFirstNPrimes(5);  // Print the first 5 prime numbers
    }

    // Method to print the first n prime numbers
    public static void printFirstNPrimes(long n) {

        generatePrimes().limit(n).forEach(System.out::println);
    }

    public static Stream<Integer> generatePrimes() {

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new PrimeIterator(), Spliterator.ORDERED), false);
    }
}

class PrimeIterator implements Iterator<Integer> {
    private int current = 2;

    @Override
    public boolean hasNext() {
        return true; // Always more primes to find
    }

    @Override
    public Integer next() {
        int nextPrime = current;
        while (!isPrime(++current)) {
            // Find the next prime number
        }
        return nextPrime;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}