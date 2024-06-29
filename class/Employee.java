
class Employee {
    String eid;
    String name;
    String department;
    String d_o_b;
    float salary;
    byte age;

    Employee(String empName, byte empAge, float empSalary, int phone) {
        age = empAge;
        salary = empSalary;
        name = empName;
    }

    void work() {
        this.increment();
    }

    void increment() {

        this.salary = this.salary + 12000;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram", (byte) 24, 50000, 897654321);

        System.out.println(emp1.name);

        emp1.d_o_b = "23-09-2001";
        emp1.eid = "007";
        emp1.department = "Developer";

        Employee emp2 = new Employee("Sachin", (byte) 24, 40000, 938615134);
        System.out.println(emp2.name);
        emp2.d_o_b = "11-01-2001";
        emp2.eid = "008";
        emp2.department = "HR";

        System.out.println("Before Work");
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
        emp1.work();
        emp2.increment();
        System.out.println("After Work");
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}
