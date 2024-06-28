public class Student {
    int id;
    String name;
    String email;
    String password;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Aman");
        Student obj2 = new Student(2, "Tushar");
        Student obj3 = new Student(3, "Sachin");

        System.out.println(obj1.name + obj1.id);
        obj2.id = 22;
        System.out.println(obj2.name + obj2.id);
        System.out.println(obj3.name);

    }

}
