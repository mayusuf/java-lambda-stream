package generic;

public class BoundedGenericList<T>{

    public T[] returnRes(T[] list){

        T[] res = (T[]) new Object[list.length];

        for(int i=0;i<list.length;i++){
            res[i] = list[i] ;
        }

        return res;
    }

    public static void main(String[] args) {

        BoundedGenericList ex = new BoundedGenericList();

        Object[] res = ex.returnRes(new Integer[]{1,3,5,7});

        for(Object o:res){
            System.out.println(o);
        }

    }

}
