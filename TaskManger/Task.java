package TaskManger;

import java.util.Date;

class Task {
    private String title;
    String description;
    Date createdAt;
    String userName;

    Task(String title, String description, Date createdAt, String userName) {
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.userName = userName;
    }

    void printTask() {
        System.out.println("Task ");
        System.out.println(this.title);
        System.out.println(this.description);
        System.out.println(this.createdAt.toString());
        System.out.println(this.userName);
    }
}
