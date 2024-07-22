package generic;

public class GenericMethod {

    public static <T> void printArray(T[] arr){

        for(T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        GenericMethod gm = new GenericMethod();
        gm.printArray(new Integer[]{1,2,3,4,5});
    }
}
