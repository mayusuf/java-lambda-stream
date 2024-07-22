package generic;

import java.util.*;

public class WildCard {

    public static void printArray(List<?> list){

        for(Object e : list){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        WildCard obj = new WildCard();
        List<String> list = Arrays.asList("a", "b", "c");
        obj.printArray(list);
    }
}
