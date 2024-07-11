package lab8_1a_b;

import java.util.function.Supplier;

public class RandomSupplier{

    private static class RandomSupplier1 implements Supplier<Double>{
        @Override
        public Double get() {
            return Math.random();
        }
    }
    public static void main(String[] args) {

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());

        Supplier<Double> r = new RandomSupplier1();
        System.out.println(r.get());
    }
}
