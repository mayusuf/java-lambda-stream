package generic;

public class UnBoundedGeneric<T extends Number> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        UnBoundedGeneric<Integer> ug = new UnBoundedGeneric<>();
        ug.set(11);
        System.out.println(ug.get());
    }
}
