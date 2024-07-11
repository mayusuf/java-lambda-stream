package lab8_4;

import java.util.List;


public class Good {

    public static void main(String[] args){

        Good good = new Good();
        System.out.println(good.countWords(Folks.friends, 'c', 'w', 5));
    }

    public int countWords(List<String> words, char c, char d, int len){

       long count =  words.stream()
               .filter(name -> name.length() == len)
               .filter(name -> name.indexOf(c) >= 0)
               .filter(name -> name.indexOf(d) < 0)
               .count();

        return (int)count;
    }
}
