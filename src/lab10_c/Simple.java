package lab10_c;

import java.util.*;

public class Simple {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(33, 3, 20, 12,5, 6);

        System.out.println(list.stream().max(Comparator.naturalOrder()).orElse(0));
        System.out.println(list.stream().min(Comparator.naturalOrder()).orElse(0));

    }

}
