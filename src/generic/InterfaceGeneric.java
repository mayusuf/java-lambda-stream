package generic;


public class InterfaceGeneric implements InterfaceGen<Integer>{

    public static void main(String[] args){

        InterfaceGen<Integer> i = new InterfaceGeneric();

        Integer res = i.add(10, 12);
        System.out.println(res);

        Integer res1 = i.substract(5, 2);
        System.out.println(res1);
    }
    @Override
    public Integer add(Integer a, Integer b){
        return a + b;
    }

    @Override
    public Integer substract(Integer a, Integer b){
        return a - b;
    }

}
