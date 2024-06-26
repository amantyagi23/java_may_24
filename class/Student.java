public class Student {
    int SID;
    String name;
    char section;
    String standard;
    String address;
    int marks[];

    Student(int SID) {
        this.SID = SID;
    }

    void prindSid() {
        System.out.println(SID);
    }

    void addMarks() {

    }

    public static void main(String[] args) {
        Student obj = new Student(12);

        obj.addMarks();
    }

}
