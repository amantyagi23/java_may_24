public class Student {
    int id;
    String name;
    String email;
    String password;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void study(String subjectName) {

    }

    void play(String gameName) {
        System.out.println(gameName);
    }

    void exam(String exameName) {
        System.out.println(exameName);
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Aman");
        Student obj2 = new Student(2, "Tushar");
        Student obj3 = new Student(3, "Sachin");

        System.out.println(obj1.name + obj1.id);
        obj1.play("crickit");
        System.out.println(obj2.name);
        obj2.study("Java");
        obj2.play("vollyball");
        System.out.println(obj3.name);
        obj3.exam("Math");
        obj2.exam("Science");

    }

}
