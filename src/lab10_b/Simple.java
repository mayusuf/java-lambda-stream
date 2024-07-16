package lab10_b;

import java.util.*;

public class Simple {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bill", "Thomas", "Mary");
        System.out.println(list.stream().reduce( (a,b)-> a+","+b).orElse(""));
    }
}
