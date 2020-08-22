package lambda.practise.comparator;

public class Employee {
    int eno;
    String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
       /* return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';*/
       return eno + " : " +ename;
    }
}
