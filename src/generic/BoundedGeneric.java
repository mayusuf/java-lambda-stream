package generic;

public class BoundedGeneric<T>{

    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }

    public static void main(String[] args) {

        BoundedGeneric <Integer> ex = new BoundedGeneric<Integer>();
        ex.set(10);
        System.out.println(ex.get());
    }

}
