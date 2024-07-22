package lab8_6;

public class Main {

    public static void main(String[] args){

        // A. (Employee e) -> e.getName()
        // Function<Employee, String> f = Employee::getName;
        //B. (Employee e,String s) -> e.setName(s)
        //BiConsumer<Employee, String> f = Employee::setName
        //C. (String s1,String s2) -> s1.compareTo(s2)
        // Comparator<String> compareTo = String::compareTo
        //D. (Integer x,Integer y) -> Math.pow(x,y)
        // BiFunction<Integer, Integer, Double> f = Math::pow
        //E. (Apple a) -> a.getWeight()
        // Function<Apple, Double> f = Apple::getWeight
        //F. (String x) -> Integer.parseInt(x);
        // Function<String, Integer> f = Integer::parseInt
        //G. EmployeeNameComparator comp = new EmployeeNameComparator();
        //(Employee e1, Employee e2) -> comp.compare(e1,e2)
        // Comparator<Employee> f = comp::compare

    }
}
