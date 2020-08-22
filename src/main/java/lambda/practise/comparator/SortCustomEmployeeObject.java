package lambda.practise.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortCustomEmployeeObject {

    public static void main(String[] args) {
        /*Employee emp1 = new Employee(100,"subhasis");
        System.out.println(emp1);*/

        ArrayList<Employee> emplst = new ArrayList<Employee>();
        emplst.add(new Employee(100,"subhasis"));
        emplst.add(new Employee(131,"vittal"));
        emplst.add(new Employee(104,"kapil"));
        emplst.add(new Employee(107,"rajith"));
        emplst.add(new Employee(117,"bivash"));
        System.out.println("before sort = "+ emplst);


        //doing sorting
        Collections.sort(emplst,(emp1,emp2)->(emp1.eno<emp2.eno)?-1:(emp1.eno>emp2.eno)?+1:0);

        System.out.println("after sort = "+ emplst);
    }
}
